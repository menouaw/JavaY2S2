package fr.esgi.poo.java;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            choose();
        }
    }

    public static void choose() {
        Random random = new Random();
        int randomValue = random.nextInt(Enum.values().length);
        System.out.println(Enum.values()[randomValue]);
    }
}
