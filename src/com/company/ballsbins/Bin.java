package com.company.ballsbins;

import java.util.ArrayList;

/**
 * Created by lennartolsen on 04/10/2016.
 */
public class Bin {
    private ArrayList<Ball> ballList;

    public Bin(){
        this.ballList = new ArrayList<Ball>();
    }

    public void AddBall(Ball b){
        this.ballList.add(b);
    }

    public boolean IsEmpty(){
        return this.ballList.isEmpty();
    }

    public int CountBalls() {
        return this.ballList.size();
    }
}
