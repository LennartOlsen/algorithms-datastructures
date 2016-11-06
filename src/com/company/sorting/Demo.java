package com.company.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by lennartolsen on 01/11/2016.
 */
public class Demo {
    /**
     * We are given an array that contains N numbers. We want to determine if there are two numbers whose sum equals a given number K.
     * For instance, if the input is 8, 4, 1, 6, and K is 10, then the answer is yes (4 and 6). A number may be used twice. Do the following:
     * a. Give an O(N2) algorithm to solve this problem.
     * b. Give an O(N log N) algorithm to solve this problem. (Hint: Sort the items first.
     * After that is done, you can solve the problem in linear time.)
     * c. Code both solutions and compare the running times of your algorithms.
     */

    public static void Demo(){
        List<Integer> integers = new ArrayList<Integer>();
        int k = 10;

        Random rn = new Random();
        int length = 1000;
        int min = 1;
        int max = 1200;


        for (int i = 0; i < length; i++) {
            integers.add(rn.nextInt((max - min) + 1) + min);
        }
        
        System.out.println(integers.toString());
        quadraticTotalExec(integers, k);
        logarithmicTotalExec(integers, k);
    }

    private static void quadraticTotalExec(List<Integer> input, int k){
        long startTime = System.nanoTime();
        if(quadraticTotal(input, k)){System.out.println("Success");}
        if(quadraticTotal(input, k)){System.out.println("Success");}
        if(quadraticTotal(input, k)){System.out.println("Success");}
        long endTime = System.nanoTime();
        System.out.print("time to execute : ");
        System.out.print((endTime - startTime) / 1000000);
        System.out.println(" ms");

    }

    private static void logarithmicTotalExec(List<Integer> input, int k){

        Collections.sort(input, (Integer a, Integer b) -> a.compareTo(b));

        long startTime = System.nanoTime();
        if(logarithmicTotal(input, k)){System.out.println("Success");}
        if(logarithmicTotal(input, k)){System.out.println("Success");}
        if(logarithmicTotal(input, k)){System.out.println("Success");}
        long endTime = System.nanoTime();
        System.out.print("time to execute : ");
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
