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

    public void Add(Object Data){
        //If no head is present we just add one
        if(head == null){
            this.head = new SinglyLinkedListElement(Data);
        }

        SinglyLinkedListElement temp = new SinglyLinkedListElement(Data);
        SinglyLinkedListElement current = head;

        //If current is null then dont handle (needless check)
        if(current != null){
            //set current to the very last one we can find
            while(current.getNext() != null){
                current = current.getNext();
            }

            //set the next node to our new one.
            current.setNext(temp);
        }

        incrementCounter();
    }

    //Insert a element at index
    public void Add(Object Data, int Index){
        SinglyLinkedListElement temp = new SinglyLinkedListElement(Data);
        SinglyLinkedListElement current = head;

        if(current != null){
            for (int i = 0; i < Index && current.getNext() != null; i++) {
                current = current.getNext();
            }
        }

        temp.setNext(current.getNext());

        current.setNext(temp);

        incrementCounter();
    }

    public Object get(int Index){
        if(isEmpty()){return null;}
        //Index out of bounds
        if(Index < 0 && Index > counter){
            return null;
        }

        SinglyLinkedListElement current = head.getNext();

        for (int i = 0; i < Index; i++) {
            //element not there
            if(current.getNext() == null){
                return null;
            }
            current = current.getNext();
        }
        //When we have looped "Index" number of times we are at the one we want
        return current.getData();
    }

    public Object remove(int Index){
        if(isEmpty()){return null;}
        //Index out of bounds
        if(Index < 0 && Index > counter){
            return null;
        }

        SinglyLinkedListElement current = head;
        for (int i = 0; i < Index; i++) {
            if (current.getNext() == null)
                return false;

            current = current.getNext();
        }

        SinglyLinkedListElement temp = current.getNext();

        //We need to skip the element that is next.
        current.setNext(current.getNext().getNext());

        // decrement the number of elements variable
        decrementCounter();
        return temp;
    }

    public boolean isEmpty(){
        //No head, no elements
        if(head == null){
            return true;
        }
        return false;
    }

    public String toString(){
        String output = "";
        if(isEmpty()){return output;}

        SinglyLinkedListElement current = head.getNext();

        while(current.getNext() != null){
            output += "[" + current.getData().toString() + "]";
            current = current.getNext();
        }
        return output;

    }

    private void incrementCounter(){
        counter++;
    }

    private void decrementCounter(){
        counter--;
    }
}
