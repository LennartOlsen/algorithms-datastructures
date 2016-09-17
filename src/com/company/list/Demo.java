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
        System.out.println(StackImpl.balPar("(()()"));

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
        cq.debug();*/

        SinglyLinkedList sll = new SinglyLinkedList();

        String name = "new";

        System.out.println(name + " is empty ? : " + sll.isEmpty());
        System.out.println(name + " length ? : " + sll.getLength());
        System.out.println(name + " get(0) ? : " + sll.get(0));

        sll.add("Hello World");

        sll.add("Hello Denmark");

        sll.add("Hello Germany");

        sll.add("Hello Italy");
        name = "4 added";

        System.out.println(name + " has element 'hello sweden' ? : " + sll.hasElement("Hello sweden"));
        System.out.println(name + " get(0) ? : " + sll.get(0).getData());
        System.out.println(name + " get(3) ? : " + sll.get(3).getData());
        System.out.println(name + " get(5) ? : " + sll.get(5));
        System.out.println(name + " as string ? : " + sll.asString());
        System.out.println(name + " remove(0) ? : " + sll.remove(0));
        System.out.println(name + " as string ? : " + sll.asString());
        System.out.println(name + " remove(1) ? : " + sll.remove(1));
        System.out.println(name + " as string ? : " + sll.asString());
        System.out.println(name + " add('Hello Odense', 1) ? : " );
        sll.add("Hello Odense", 1);
        System.out.println(name + " as string ? : " + sll.asString());
        System.out.println(name + " add('Hello Vejle', 1) ? : " );
        sll.add("Hello Vejle", 1);
        System.out.println(name + " as string ? : " + sll.asString());
        System.out.println(name + " get(0) ? : " + sll.get(0).getData());
        System.out.println(name + " get(1) ? : " + sll.get(1).getData());


    }
}
