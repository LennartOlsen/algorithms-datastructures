package com.company;

public class Main {

    public static void main(String[] args) {
        /** Using fully qualified names due to Java not supporting import aliasing ( dinosaur rawr ) **/

        /** Recursive test **/
        com.company.recursions.Basics.Test();

        /** Generics test **/
        com.company.generics.Basics.Test();
    }
}