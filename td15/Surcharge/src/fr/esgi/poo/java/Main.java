package fr.esgi.poo.java;

public class Main {
    public static void main(String[] args) {
        Ambiguous amb = new Ambiguous();

        System.out.println(amb.calculate(1, 2L));
        System.out.println(amb.calculate(2L, 4));
    }
}
