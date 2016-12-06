package com.company.sorting.total;

import java.util.List;

/**
 * Created by lennartolsen on 06/11/2016.
 */
public class QuadraticTotal {

    public static void quadraticTotalExec(List<Integer> input, int k){
        long startTime = System.nanoTime();
        if(quadraticTotal(input, k)){System.out.println("Success");}
        if(quadraticTotal(input, k)){System.out.println("Success");}
        if(quadraticTotal(input, k)){System.out.println("Success");}
        long endTime = System.nanoTime();
        System.out.print("Quadratic time to execute : ");
        System.out.print((endTime - startTime) / 1000000);
        System.out.println(" ms");

    }

    private static boolean quadraticTotal(List<Integer> input, int total){
        for (int i = 0; i < input.size() - 1; i++) {
            for (int j = 0; j < input.size() - 1; j++) {
                if(input.get(i) + input.get(j) == total){
                    return true;
                }
            }
        }
        return false;
    }
}
