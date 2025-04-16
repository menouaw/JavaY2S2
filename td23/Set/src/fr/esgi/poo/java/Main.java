package fr.esgi.poo.java;

public class Main {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        
        lottery.setBall();
        
        lottery.print();
        
        System.out.println("\nTirage de " + Lottery.NB + " boules:");
        
        lottery.pickBall();
    }
}
