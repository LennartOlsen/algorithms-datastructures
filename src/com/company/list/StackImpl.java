package com.company.list;

import java.util.Stack;

/**
 * Created by lennartolsen on 13/09/2016.
 */
public class StackImpl {
    /**
     * Test if the paraentheses are balanced
     * @param text
     * @return true if balanced
     */
    public static boolean balPar(String text){
        Stack stack = new Stack();
        for(char ch: text.toCharArray()){
            if(ch == '('){
                stack.push(true);
            }
            if(ch == ')'){
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
