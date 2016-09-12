package com.company.generics.functional;

import java.util.Comparator;

/**
 * Created by lennartolsen on 12/09/2016.
 */
public class Demo {
    public static void Demo(){
        String [ ] arr = { "ZEBRA","alligator", "Krokodil", "ZZZBRA", "Wombat" };
        System.out.println( FindMaxFunctional(arr, new CaseInsenitiveCompare()) );
    }

    /**
     * ## EXAMPLE (Figure 1.18) ##
     * Generic type bound method for finding the largest element in any array.
     * @param haystack An array of any old type
     * @param comparator function that implements Comparator interface
     * @param <T>
     * @return T
     */
    public static <T> T FindMaxFunctional(T [] haystack, Comparator<? super T> comparator){
        //the index of the "max" object in the array
        int maxIndex = 0;

        for (int i = 1; i < haystack.length; i++){
            if(comparator.compare(haystack[ i ], haystack[maxIndex]) > 0){
                maxIndex = i;
            }
        }

        return haystack[maxIndex];
    }
}
