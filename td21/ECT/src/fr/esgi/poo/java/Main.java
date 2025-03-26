package fr.esgi.poo.java;

public class Main {
    public static void main(String[] args) {
        PositiveNumber v = new PositiveNumber();

        try {
            v.setValue(2);
            v.setValue(-1);
        } catch (NotPositiveNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
