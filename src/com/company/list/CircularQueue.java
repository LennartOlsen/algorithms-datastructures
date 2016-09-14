package com.company.list;

/**
 * Created by lennartolsen on 13/09/2016.
 */
public class CircularQueue {
    private int length;
    private int[] container;
    private int head;
    private int tail;


    public CircularQueue(int length) {
        this.length = length;
        this.container = new int[length];
        this.head = 0;
        this.tail = 0;
    }

    public boolean enqueue(int elem){
        if(this.isFull()){
            return false;
        } else {
            this.container[tail] = elem;
            this.tail++;

            return true;
        }
    }

    public int dequeue(){
        int temp = this.container[head];
        this.container[head] = 0;
        head++;
        if(head >= this.length){
            this.head = 0;
        }
        return temp;
    }

    public boolean isFull(){
        return tail >= this.length;
    }
    public boolean isEmpty(){
        return head >= this.length;
    }

    public void debug(){
        System.out.println("Head : " + this.head + " Tail" + this.tail);
        for (int i = 0; i < this.length; i++) {
            System.out.println("Position " + i + " contains " + this.container[i]);
        }
    }
}
