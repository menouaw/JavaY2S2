package fr.esgi.poo.java.cond;

public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice();

        Draws draws = new Draws();
        draws.pick(10);
        draws.drawsResult();

    }
}
