package com.company.list;

/**
 * Created by lennartolsen on 13/09/2016.
 */
public class SinglyLinkedList {
    private SinglyLinkedListElement head;
    private static int counter;


    public SinglyLinkedList() {
        counter = 0;
    }

    public void add(Object Data){
        //If no head is present we just add one
        if(head == null){
            this.head = new SinglyLinkedListElement(Data);
            return;
        }
        add(Data, counter);
    }

    //Insert a element at index
    public void add(Object Data, int Index){
        SinglyLinkedListElement temp = new SinglyLinkedListElement(Data);

        SinglyLinkedListElement current = get(Index);

        temp.setNext(current.getNext());

        current.setNext(temp);

        incrementCounter();
    }

    public SinglyLinkedListElement get(int Index){
        if(isEmpty()){return null;}
        //Index out of bounds
        if(Index < 0 && Index > counter){
            return null;
        }

        SinglyLinkedListElement current = head;

        for (int i = 0; i < Index; i++) {
            //element not there
            if(current.getNext() == null){
                return null;
            }
            current = current.getNext();
        }
        //When we have looped "Index" number of times we are at the one we want
        return current;
    }

    public Object remove(int Index){
        if(isEmpty()){return null;}
        //Index out of bounds
        if(Index < 0 && Index > counter){
            return null;
        }

        SinglyLinkedListElement current = head;
        SinglyLinkedListElement temp = head;

        if(Index == 0){
            this.head = head.getNext();
        } else {
            current = get(Index - 1);
            temp = current.getNext();
        }

        //We need to skip the element that is next.
        current.setNext(current.getNext().getNext());

        // decrement the number of elements variable
        decrementCounter();
        return temp.getData();
    }

    public boolean isEmpty(){
        //No head, no elements
        if(head == null){
            return true;
        }
        return false;
    }

    public String asString(){
        String output = "";
        if(isEmpty()){return output;}

        SinglyLinkedListElement current = head;

        while(current != null){
            output += "[" + current.getData().toString() + "]";
            current = current.getNext();
        }
        return output;

    }

    public boolean hasElement(Object Data){
        if(isEmpty()){return false;}

        SinglyLinkedListElement current = head;
        while(current != null){
            if(current.getData() == Data){
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public int getLength(){
        return counter;
    }

    private void incrementCounter(){
        counter++;
    }

    private void decrementCounter(){
        counter--;
    }
}
