package com.company.sorting.models;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by lennartolsen on 15/11/2016.
 */
public class Point {
    int x;
    int y;

    String id;

    ArrayList<Relation> relations = null;

    public Point(int x, int y, String id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public ArrayList<Relation> getRelations(){
        return relations;
    }

    @Override
    public String toString(){
        return id + ":[" + getX() +"," + getY() +"]";
    }
}
