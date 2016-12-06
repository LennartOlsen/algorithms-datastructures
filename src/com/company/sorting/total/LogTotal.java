package com.company.sorting.total;

import java.util.Collections;
import java.util.List;

/**
 * Created by lennartolsen on 06/11/2016.
 */
public class LogTotal {

    public static void logarithmicTotalExec(List<Integer> input, int k){

        Collections.sort(input, (Integer a, Integer b) -> a.compareTo(b));

        long startTime = System.nanoTime();
        if(logarithmicTotal(input, k)){System.out.println("Success");}
        if(logarithmicTotal(input, k)){System.out.println("Success");}
        if(logarithmicTotal(input, k)){System.out.println("Success");}
        long endTime = System.nanoTime();
        System.out.print("Logarithmic time to execute : ");
        System.out.print((endTime - startTime) / 1000000);
        System.out.println(" ms");

    }

    /**
     * WALK TOWARDS MIDDLE
     * @param input
     * @param total
     * @return
     */
    private static boolean logarithmicTotal(List<Integer> input, int total){

        int y = input.size() - 1;
        int x = 0;

        while(true){
            Integer xVal = input.get(x);
            Integer yVal = input.get(y);
            if(xVal + yVal == total){
                //System.out.println("YAY");
                return true;
            }
            if(xVal + yVal < total){
                //System.out.println("I WAS LESS");
                x++;
            }
            if(xVal + yVal > total){
                //System.out.println("I WAS MORE");
                y--;
            }
            if(y == x){
                //System.out.println("You done goofed");
                return false;
            }
        }
    }
}
