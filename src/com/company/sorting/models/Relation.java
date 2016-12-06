package com.company.sorting.models;

/**
 * Created by lennartolsen on 22/11/2016.
 */
public class Relation {
    private Point current;
    private Point next;
    private float slope;
    private float yIntercept;

    public Relation(Point current, Point next, float slope, float yIntercept) {
        this.current = current;
        this.next = next;
        this.slope = slope;
        this.yIntercept = yIntercept;
    }

    public String getRelationId(){
        return "slope"+ slope + "yintercept"+yIntercept;
    }

    public float getSlope() {
        return slope;
    }

    public float getyIntercept() {
        return yIntercept;
    }

    @Override
    public String toString() {
        return "Relation{" +
                "current=" + current +
                ", next=" + next +
                ", slope=" + slope +
                ", yIntercept=" + yIntercept +
                '}';
    }
}
