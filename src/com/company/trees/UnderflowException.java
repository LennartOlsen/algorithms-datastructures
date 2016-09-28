package com.company.trees;

/**
 * Created by lennartolsen on 26/09/2016.
 */
public class UnderflowException extends Exception  {
    public UnderflowException() { super(); }
    public UnderflowException(String message) { super(message); }
    public UnderflowException(String message, Throwable cause) { super(message, cause); }
    public UnderflowException(Throwable cause) { super(cause); }
}