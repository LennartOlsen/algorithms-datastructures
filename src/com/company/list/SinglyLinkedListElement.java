package com.company.list;

/**
 * Created by lennartolsen on 13/09/2016.
 */
public class SinglyLinkedListElement {
    private SinglyLinkedListElement next;
    private Object data;

    /**
     * Creates a new element with no next (last element in list)
     * @param Data Content of the list element
     */
    public SinglyLinkedListElement(Object Data) {
        next = null;
        data = Data;
    }

    /**
     * Creates a new element with a next (not the last element in the list)
     * @param Data Content of the list element
     * @param Next The "next" element
     */
    public SinglyLinkedListElement(Object Data, SinglyLinkedListElement Next){
        next = Next;
        data = Data;
    }

    public Object getData(){
        return data;
    }

    public void setData(Object Data){
        data = Data;
    }

    public SinglyLinkedListElement getNext(){
        return next;
    }

    public void setNext(SinglyLinkedListElement Next){
        next = Next;
    }

}
