package com.company.ballsbins;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by lennartolsen on 04/10/2016.
 */
public class Demo {
    /**
     *
     * @param length        The number of balls and bins
     * @param powerOfTwo    False disables the power of two functionality
     */
    public static void Demo(int length, boolean powerOfTwo){
        ArrayList<Ball> BallList = new ArrayList<Ball>();
        ArrayList<Bin> BinList = new ArrayList<Bin>();

        /**
         * INIT ::
         */
        for (int i = 0; i < length; i++) {
            BallList.add(new Ball(i));
            BinList.add(new Bin());
        }

        /**
         * RECURSION ::
         */

        Random rn = new Random();
        for (Ball b: BallList) {

            int pos = rn.nextInt(length);
            Bin bin = BinList.get(pos);

            if(!powerOfTwo){bin.AddBall(b); continue;}

            if(bin.IsEmpty()){
                bin.AddBall(b);
            } else {
                pos = rn.nextInt(length);
                bin = BinList.get(pos);

                bin.AddBall(b);
            }
        }


        /**
         * DEBUG ::
         */

        int noBall = 0;
        int oneBall = 0;
        int manyBall = 0;
        int maxBallInBin = 0;
        for(Bin bin : BinList) {
            if (bin.CountBalls() == 0) {
                noBall++;
            }
            if (bin.CountBalls() == 1) {
                oneBall++;
            }
            if (bin.CountBalls() > 1) {
                manyBall++;
            }
            if (bin.CountBalls() > maxBallInBin) {
                maxBallInBin = bin.CountBalls();
            }
        }

        System.out.println();
        System.out.println("LENGTH : " + length);
        System.out.println("POWER OF TWO : " + powerOfTwo);
        System.out.println("No ball bins : " + noBall);
        System.out.println("One ball bins : " + oneBall);
        System.out.println("More than One ball bins : " + manyBall);
        System.out.println("MAX BALLS : " + maxBallInBin);

    }
}
