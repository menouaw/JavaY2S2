package fr.esgi.poo.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Lottery {
    public static final int MAX = 30;
    public static final int NB = 5;

    private HashSet<Ball> balls;

    public void setBall() {
        balls = new HashSet<Ball>();
        for (int i = 0; i < MAX; i++) {
            Ball ball = new Ball(i+1);
            balls.add(ball);
        }
    }

    public void print() {
        System.out.println("Ensemble des " + MAX + " boules: ");
        Iterator<Ball> iterator = balls.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getNum());
        }
    }

    public void pickBall() {
        if (balls != null) {

            Object[] ballArray = balls.toArray();

            Random random = new Random();

            for (int i = 0; i < NB; i++) {
                Ball ball = (Ball) ballArray[random.nextInt(ballArray.length)];
                System.out.println(ball.getNum());
                balls.remove(ball);
                ballArray = balls.toArray();
            }
        }
    }
}
