package com.company.generics;

/**
 * Created by lennartolsen on 12/09/2016.
 */
public class GenericMemoryCell<AnyType> {
    public AnyType read(){
        return storedValue;
    }
    public void write( AnyType x ) {
        storedValue = x;
    }

    private AnyType storedValue;
}
