package com.company.generics.shapes;

/**
 * Created by lennartolsen on 12/09/2016.
 */

public class Square implements IShape {
    public Square(double length, double width) {
        Length = length;
        Width = width;
    }

    private double Length;
    private double Width;

    public double Area(){
        return Length * Width;
    }
}
