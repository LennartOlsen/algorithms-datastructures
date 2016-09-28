package com.company.trees;

/**
 * Created by lennartolsen on 26/09/2016.
 */
public class Demo {

    public static void BSTDemo() throws UnderflowException {

        BinarySearchTree<Integer> t = new BinarySearchTree<>( );

        final int NUMS = 4000;
        final int GAP  =   37;

        for( int i = GAP; i != 0; i = ( i + GAP ) % NUMS )
            t.insert( i );

        //t.printTree( );

        System.out.println(t.countNodes());
        System.out.println(t.countFullNodes());
        System.out.println(t.countLeaves());

        BinarySearchTree<Integer> tNew = new BinarySearchTree<>( );

        tNew.insert( 4 );
        tNew.insert( 2 );
        tNew.insert( 1 );
        tNew.insert( 3 );

        System.out.println(tNew.countNodes());
        System.out.println(tNew.countFullNodes());
        System.out.println(tNew.countLeaves());

        //t.printTree( );
    }
}
