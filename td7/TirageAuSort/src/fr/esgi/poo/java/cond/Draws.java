package fr.esgi.poo.java.cond;

import static fr.esgi.poo.java.cond.Dice.NB_DICE_FACES;

public class Draws {
    private static final int NB_PICKS = 100;

    private int[] faces = new int[NB_DICE_FACES+1];

    public Draws() {
    }

    public void pick() {
        pick(NB_PICKS);
    }

    public void pick(int n) {
        // int[] picks = new int [n];

        Dice pickedDice = new Dice();
        for (int i = 0; i < n; i++) {
            int picks = pickedDice.roll();

            faces[picks-1]++;
            //System.out.println(picks[i]);
        }
    }

    public void drawsResult() {
        for (int i = 0; i < NB_DICE_FACES; i++) {
            System.out.printf("Face %d: %d fois. \n", i+1, faces[i]);
        }
    }
}
