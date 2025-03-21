package fr.esgi.poo.java.cond;

import java.util.Random;

public class Dice {
    Random rand = new Random();

    public static final int NB_DICE_FACES = 6;

    public Dice() {
    }

    public int roll() {
        return rand.nextInt(NB_DICE_FACES) + 1;
    }
}
