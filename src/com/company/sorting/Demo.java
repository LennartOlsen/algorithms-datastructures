package com.company.sorting;

import com.company.ballsbins.Ball;
import com.company.sorting.array.Booleans;
import com.company.sorting.models.Point;
import com.company.sorting.models.Relation;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;

import static com.company.sorting.total.LogTotal.logarithmicTotalExec;
import static com.company.sorting.total.QuadraticTotal.quadraticTotalExec;

/**
 * Created by lennartolsen on 01/11/2016.
 */
public class Demo {

    public static void Demo(){
        Exercise753();
        Exercise744();
        ArrayList<Point> points = new ArrayList<Point>();
        points.add(new Point(1,2,"0"));
        points.add(new Point(2,3,"1"));
        points.add(new Point(3,4,"2"));
        points.add(new Point(4,4,"3"));
        points.add(new Point(4,5,"4"));
        points.add(new Point(0,1,"5"));
        Exercise738(points);
    }

    /**
     * We are given an array that contains N numbers. We want to determine if there are two numbers whose sum equals a given number K.
     * For instance, if the input is 8, 4, 1, 6, and K is 10, then the answer is yes (4 and 6). A number may be used twice. Do the following:
     * a. Give an O(N2) algorithm to solve this problem.
     * b. Give an O(N log N) algorithm to solve this problem. (Hint: Sort the items first.
     * After that is done, you can solve the problem in linear time.)
     * c. Code both solutions and compare the running times of your algorithms.
     */
    public static void Exercise753(){
        List<Integer> integers = new ArrayList<Integer>();
        int k = 10;

        Random rn = new Random();
        int length = 1000;
        int min = 1;
        int max = 1200;


        for (int i = 0; i < length; i++) {
            integers.add(rn.nextInt((max - min) + 1) + min);
        }

        quadraticTotalExec(integers, k);
        logarithmicTotalExec(integers, k);
    }

    public static void Exercise744(){
        ArrayList<Boolean> sortMe = new ArrayList<Boolean>();
        Random rn = new Random();
        int length = 10000;

        for (int i = 0; i < length; i++) {
            if(rn.nextInt() % 2 == 0) {
                sortMe.add(true);
            } else {
                sortMe.add(false);
            }
        }

        Booleans.WalkSortNonConstant(sortMe);
        Booleans.WalkSortConstant(sortMe);
    }

    /**
     * Write a program that reads N points in a plane and outputs any group of four or more colinear points (i.e., points on the same line).
     * The obvious brute-force algorithm requires O(N4) time.
     * However, there is a better algorithm that makes use of sorting and runs in O(N2 log N) time.
     * This is even better
     */
    public static void Exercise738(ArrayList<Point> Points){
        HashMap<String, ArrayList<String>> pointMap = new HashMap<>();

        for (int i = 0; i < Points.size(); i++){
            Point currentPoint = Points.get(i);
            for (int j = i; j < Points.size(); j++){
                if(j != i) {
                    float slope = CalculateSlope(currentPoint, Points.get(j));
                    Relation r = new Relation(currentPoint, Points.get(j), slope, YIntercept(currentPoint, slope));

                    ArrayList<String> ps = new ArrayList<>();
                    if(pointMap.get(r.getRelationId()) != null){
                        ps = pointMap.get(r.getRelationId());
                    }
                    ps.add("[" + currentPoint.toString() + "," + Points.get(j).toString() + "]" );
                    pointMap.put(r.getRelationId(), ps);

                    if(ps.size() == 4){
                        System.out.println(ps.toString());
                        System.out.println("Success");
                        return;
                    }
                }
            }
        }
        System.out.println("no success");
    }

    /**
     *  a=(y2−y1)/(x2−x1)
     * @param Current y1,x1
     * @param Next y2,x2
     * @return
     */
    private static float CalculateSlope(Point Current, Point Next){
        return (float) (Current.getY() - Next.getY()) / (Current.getX() - Next.getX());
    }

    private static float YIntercept(Point Current, float slope){
        return (float) (Current.getY()) - (slope * Current.getX());
    }
}
