package com.company;

import com.company.trees.UnderflowException;

public class Main {

    public static void main(String[] args) {

        /** Recursive test **/
        //com.company.recursions.Basics.Test();

        /** Generics test **/
        //com.company.generics.Basics.Test();

        /** Shape Example **/
        //com.company.generics.shapes.Demo.Demo();

        /** Functional Example **/
        //com.company.generics.functional.Demo.Demo();

        /** Stack demo **/
        //com.company.list.Demo.Demo();

        /**BST DEMO **/
        try {
            com.company.trees.Demo.BSTDemo();
        } catch (UnderflowException e){
            System.out.println("Underflows");
        }

        //Ball and bin example
        com.company.ballsbins.Demo.Demo(10007,true);
        com.company.ballsbins.Demo.Demo(10007,true);
        com.company.ballsbins.Demo.Demo(10007,true);

        //Ball and bin example
        com.company.ballsbins.Demo.Demo(10007,false);
        com.company.ballsbins.Demo.Demo(10007,false);
        com.company.ballsbins.Demo.Demo(10007,false);/**

        Integer[] insertNums = {100,2,3,4,5,6,7,8};

        com.company.hashing.Proper qh = new com.company.hashing.Proper(2);

        for (Integer num: insertNums) {
            qh.insert(num);
        }
        System.out.println("Polynom : " + qh.getPolynomial());
        System.out.println(qh.print());
        System.out.println(qh.traversals);

        qh = new com.company.hashing.Proper(5);

        for (Integer num: insertNums) {
            qh.insert(num);
        }
        System.out.println("Polynom : " + qh.getPolynomial());
        System.out.println(qh.print());
        System.out.println(qh.traversals);

        qh = new com.company.hashing.Proper(7);

        for (Integer num: insertNums) {
            qh.insert(num);
        }
        System.out.println("Polynom : " + qh.getPolynomial());
        System.out.println(qh.print());
        System.out.println(qh.traversals);*/

        com.company.sorting.Demo.Demo();
    }
}
