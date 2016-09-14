package com.company.list;

/**
 * Created by lennartolsen on 13/09/2016.
 */
public class Demo {
    public static void Demo(){
        /*System.out.println("testing (())(())");
        System.out.println(StackImpl.balPar("(())(())"));

        System.out.println("testing (((()))");
        System.out.println(StackImpl.balPar("(((()))"));

        System.out.println("testing )()");
        System.out.println(StackImpl.balPar(")()"));

        System.out.println("testing ");
        System.out.println(StackImpl.balPar(""));

        System.out.println("testing System();");
        System.out.println(StackImpl.balPar("System();"));

        System.out.println("testing (()()");
        System.out.println(StackImpl.balPar("(()()"));*/

        CircularQueue cq = new CircularQueue(4);
        cq.enqueue(1);
        cq.enqueue(2);
        cq.enqueue(3);
        cq.enqueue(4);
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
        cq.enqueue(5);
        cq.dequeue();
        cq.dequeue();
        cq.enqueue(6);
        cq.debug();
    }
}
