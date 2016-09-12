package com.company.recursions;

/**
 * Created by lennartolsen on 12/09/2016.
 */
public class Basics {

    public static void Test() {
        long startTime = System.nanoTime();
        System.out.println(PrimeMethod(2796203));
        long endTime = System.nanoTime();
        System.out.print("time to execute : ");
        System.out.print((endTime - startTime) / 1000000);
        System.out.println(" ms");

        startTime = System.nanoTime();
        System.out.println(PrimeMethod(1111111111));
        endTime = System.nanoTime();
        System.out.print("time to execute : ");
        System.out.print((endTime - startTime) / 1000000);
        System.out.println(" ms");

        startTime = System.nanoTime();
        System.out.println(PrimeMethod(4));
        endTime = System.nanoTime();
        System.out.print("time to execute : ");
        System.out.print((endTime - startTime) / 1000000);
        System.out.println(" ms");

        startTime = System.nanoTime();
        System.out.println(PrimeMethod(6));
        endTime = System.nanoTime();
        System.out.print("time to execute : ");
        System.out.print((endTime - startTime) / 1000000);
        System.out.println(" ms");

        startTime = System.nanoTime();
        System.out.println(PrimeMethodShort(9));
        endTime = System.nanoTime();
        System.out.print("time to execute : ");
        System.out.print((endTime - startTime) / 1000000);
        System.out.println(" ms");

        startTime = System.nanoTime();
        System.out.println(PrimeMethod(9));
        endTime = System.nanoTime();
        System.out.print("time to execute : ");
        System.out.print((endTime - startTime) / 1000000);
        System.out.println(" ms");

    }
    /* Sum of the natrual numvers 1...n  n is the paramter*/
    public static int SumMethod(int n){
        if(n == 0){
            return 0;
        } else {
            return SumMethod(n-1) + n;
        }
    }

    public static boolean PrimeMethod(long n) {
        System.out.println("Long testing : " + n);
        for(long m=2;m<n;m++) {
            if(n%m==0)
                return false;
        }
        return true;
    }

    public static boolean PrimeMethodSqrt(long n) {
        for(long m=2;m<Math.sqrt(n);m++) {
            if(n%m==0)
                return false;
        }
        return true;
    }

    /** Wrongly **/
    public static boolean PrimeMethodShort(long n){
        if(n%2==0)
            return false;
        else
            return true;
    }}
