package com.company.trees;

/**
 * Created by lennartolsen on 26/09/2016.
 */
public class Demo {

    public static void BSTDemo() throws UnderflowException {

        BinarySearchTree<Integer> t = new BinarySearchTree<>( );

        final int NUMS = 50;
        final int GAP  = 3;

        /*for( int i = GAP; i != 0; i = ( i + GAP ) % NUMS )
            t.insert( i );*/

        t.insert( 3 );
        t.insert( 4 );
        t.insert( 1 );
        t.insert( 6 );
        t.insert( 2 );
        t.insert( 5 );
        t.insert( 7 );

        t.inOrder();
        System.out.println();
        t.preOrder();
        System.out.println();
        t.postOrder();
        System.out.println();
        t.levelOrder();
        System.out.println();

        System.out.println(t.countNodes());
        System.out.println(t.countFullNodes());
        System.out.println(t.countLeaves());/*

        BinarySearchTree<Integer> tNew = new BinarySearchTree<>( );

        tNew.insert( 4 );
        tNew.insert( 2 );
        tNew.insert( 1 );
        tNew.insert( 3 );

        System.out.println(tNew.countNodes());
        System.out.println(tNew.countFullNodes());
        System.out.println(tNew.countLeaves());**/
    }
}
