package com.company.generics;

import com.company.generics.shapes.Circle;
import com.company.generics.shapes.IShape;

import java.util.ArrayList;
import java.util.List;

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

    /**
     * ## EXAMPLE ##
     * This would be used in a collection implementation.
     * Generic method for searching a array of any type
     * @param haystack the array to search in
     * @param needle the value to search for
     * @param <T> the type
     * @return boolean
     */
    public static <T> boolean Contains( T [] haystack, T needle){
        for( T val : haystack){
            if( needle.equals( val) ){
                return true;
            }
        }
        return false;
    }

    /**
     * ## EXAMPLE ##
     * This would be used in a collection implementation.
     * Generick type bound method for finding the largest element in any array.
     * ## The <? super T> is an example of using a wildcard in the implementation
     * @param haystack
     * @param <T>
     * @return T
     */
    public static <T extends Comparable<? super T>> T FindMax(T [] haystack){
        int maxIndex = 0;
        for (int i = 1; i < haystack.length; i++){
            if(haystack[ i ].compareTo(haystack[maxIndex]) > 0){
                maxIndex = i;
            }
        }

        return haystack[maxIndex];
    }


}
