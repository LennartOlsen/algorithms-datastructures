package com.company.generics;

/**
 * Created by lennartolsen on 12/09/2016.
 */
public class Basics {
    public static void Test() {
        /** Autoboxing and unboxing Java7+, using the diamond operator **/
        GenericMemoryCell<Integer> m = new GenericMemoryCell<>();

        m.write( 4 );
        int val = m.read();
        System.out.println("Contents are ( java7 ) : " + val);

        /** oldschoold boxing Java5+, using the diamond operator **/
        GenericMemoryCell<Integer> mOld = new GenericMemoryCell<Integer>();

        mOld.write( 4 );
        int valOld = mOld.read();
        System.out.println("Contents are ( java5 ) : " + valOld);
    }
}
