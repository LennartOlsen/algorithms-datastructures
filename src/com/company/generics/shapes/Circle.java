package com.company.generics.shapes;

/**
 * Created by lennartolsen on 12/09/2016.
 */
public class Circle implements IShape {
    private double Radius;

    public Circle(double radius) {
        Radius = radius;
    }

    public double Area(){
        return Radius * Math.PI;
    }
}
