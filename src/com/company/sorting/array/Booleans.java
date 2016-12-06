package com.company.sorting.array;

import java.util.ArrayList;

/**
 * Created by lennartolsen on 06/11/2016.
 */
public class Booleans {

    public static void WalkSortNonConstant(ArrayList<Boolean> input){
        long startTime = System.nanoTime();
        WalkSort(input);
        WalkSort(input);
        WalkSort(input);
        long endTime = System.nanoTime();
        System.out.print("Walk Constant time to execute : ");
        System.out.print((endTime - startTime) / 1000000);
        System.out.println(" ms");
    }

    private static ArrayList<Boolean> WalkSort(ArrayList<Boolean> input){
        ArrayList<Boolean> output = new ArrayList<>();

        for (int i = 0; i < input.size(); i++) {
            if(input.get(i) == true){
                output.add(input.get(i));
            } else {
                output.add(0, input.get(i));
            }
        }

        return output;
    }

    public static void WalkSortConstant(ArrayList<Boolean> input){
        long startTime = System.nanoTime();
        WalkSortWithLength(input);
        WalkSortWithLength(input);
        WalkSortWithLength(input);
        long endTime = System.nanoTime();
        System.out.print("Walk Constant time to execute : ");
        System.out.print((endTime - startTime) / 1000000);
        System.out.println(" ms");
    }

    private static Boolean[] WalkSortWithLength(ArrayList<Boolean> input){
        Boolean[] output = new Boolean[input.size()];
        Integer falsei = 0;
        Integer truei = input.size() - 1;

        for (int i = 0; i < input.size(); i++) {
            if(input.get(i) == true){
                output[truei] = input.get(i);
                truei--;
            } else {
                output[falsei] = input.get(i);
                falsei++;
            }
        }
        return output;
    }
}
