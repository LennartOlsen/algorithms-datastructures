package com.company.generics.shapes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by lennartolsen on 12/09/2016.
 */
public class Demo {
    public static void Demo(){
        IShape[ ] shapeArr = {new Square(2, 2), new Circle(3)};
        Square[ ] squareArr = {new Square(2,2), new Square(3,2)};

        /** The same as shape arr **/
        List<IShape> shapeList = new ArrayList<>();
        shapeList.add(new Square(2,2));
        shapeList.add(new Circle(3));

        /** The same as squareArr **/
        List<Square> squareList = new ArrayList<>();
        squareList.add(new Square(2,2));
        squareList.add(new Square(3, 2));

        System.out.println("total area of Shape collection : " + totalAreaShape(shapeList));

        System.out.println("total area of Square collection : " + totalAreaGeneric(squareList));


    }
    /** Accepts all the arrays **/
    private static double totalArea( IShape [] arr){
        double total = 0;

        for( IShape s : arr ){
            if( s != null){
                total += s.Area();
            }
        }

        return total;
    }
    /** Accepts only the Shape specefic instances (try calling with totalAreaShape(squareList))  **/
    private static double totalAreaShape( Collection<IShape> arr){
        double total = 0;

        for( IShape s : arr ){
            if( s != null){
                total += s.Area();
            }
        }

        return total;
    }
    /** Accepts all the lists **/
    private static double totalAreaGeneric( Collection<? extends IShape> arr){
        double total = 0;

        for( IShape s : arr ){
            if( s != null){
                total += s.Area();
            }
        }

        return total;
    }
}
