package com.company.utils;

/**
 * Created by lennartolsen on 30/11/2016.
 */
public class Strings {
    /** Kindly Stolen from the interwebs **/
    public static String toAlphabetic(int i) {
        if( i<0 ) {
            return "-"+toAlphabetic(-i-1);
        }

        int quot = i/26;
        int rem = i%26;
        char letter = (char)((int)'A' + rem);
        if( quot == 0 ) {
            return ""+letter;
        } else {
            return toAlphabetic(quot-1) + letter;
        }
    }
}
