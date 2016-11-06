package com.company.hashing;

/**
 * Created by lennartolsen on 11/10/2016.
 */
public class Proper {
    //The table to store data
    private Integer table[] = new Integer[8];
    //The number of values in the table
    private Integer valueCount = 0;
    //Whether or not we're resizing
    private boolean resizing = false;
    //Number of traversals
    public Integer traversals = 0;

    public int getPolynomial() {
        return polynomial;
    }

    private int polynomial = 2;

    public Proper(int polynomial) {
        this.polynomial = polynomial;
    }


    /**
     * Name:    hashFunction
     * Desc:    Calculate the hash of the given value.
     */
    private Integer hashFunction(Integer value) {
        return (2 * value + 5) % table.length;
    }

    /**
     * Name:    loadFactor
     * Desc:    Return the load factor of the hash table.
     */
    private Float loadFactor() {
        return (float) valueCount / table.length;
    }

    /**
     * Name:    probe
     * Desc:    Given a value and whether or not we're looking for an empty space or a value
     *          this function will return the index cooresponding to the desired value using
     *          quadratic probing.
     */
    private Integer probe(Integer value, Boolean deleting) {
        //Calculate the hash
        Integer hash = hashFunction(value);
        //Set the index = 0 for the quadratic traversal
        Integer index = 0;
        //If we're deleting then we're looking for the table entry the value exists in
        //else we're looking for an empty space
        if(deleting) {
            //While we haven't found the value we're looking for
            while(table[hash] != value) {
                traversals++;
                //Calculate the next key to check using quadratic probing c1 = 1/2 and c2 = 1/2
                //h(k, i) = (h(k) + i/2 + i^2 / 2) % (length of table)
                hash = (int) ((hash + (float)index / 2 + (float)(Math.pow(index, polynomial)) / 2) % table.length);
                //increment index
                index++;
            }
        } else {
            //Same thing as above just looking for an empty space instead of the value
            System.out.print("Trying to insert : " + value + " to " + hash);
            while(table[hash] != null) {
                traversals++;
                hash = (int) ((hash + (float)index / 2 + (float)(Math.pow(index, polynomial)) / 2) % table.length);
                index++;
                if(table[hash] != null){
                    System.out.print("\t table[" + hash + "]");
                }
            }
            System.out.println();
        }
        return hash;
    }

    /**
     * Name:    resize
     * Desc:    Shrinks the table if the load factor drops below 0.25 and is greater than 8 elements.
     *          Grows the table if the load factor is greater than 0.5.
     */
    private void resize() {
        resizing = true;
        Integer tempTable[] = table;
        if(loadFactor() >= 0.5) {
            table = new Integer[tempTable.length * 2];
            for(Integer i = 0; i < tempTable.length; i++) {
                if(tempTable[i] != null) {
                    insert(tempTable[i]);
                }
            }
        } else if(loadFactor() <= 0.25 && tempTable.length > 8) {
            table = new Integer[tempTable.length / 2];
            for(Integer i = 0; i < tempTable.length; i++) {
                if(tempTable[i] != null) {
                    insert(tempTable[i]);
                }
            }
        }
        resizing = false;
    }

    /**
     * Name:    insert
     * Desc:    Given an integer value calculate it's hash and insert it into the table
     *          at the appropriate location.
     */
    public void insert(Integer value) {
        Integer hash = probe(value, false);
        table[hash] = value;
        if(!resizing) {
            valueCount++;
            //resize();
        }
    }

    /**
     * Name:    delete
     * Desc:    Given an Integer value find the value in the table and remove it,
     *          shrink if necessary.
     */
    public void delete(Integer value) {
        Integer hash = probe(value, true);
        table[hash] = null;
        if(!resizing) {
            valueCount--;
            resize();
        }
    }

    /**
     * Name:    print
     * Desc:    Print the contents of the table in order of keys
     *          to a string and return the string
     */
    public String print() {
        String result = "";
        for(Integer i = 0; i < table.length; i++) {
            if(table[i] != null) {
                result += table[i] + " ";
            }
        }
        return result + "\n";
    }

}
