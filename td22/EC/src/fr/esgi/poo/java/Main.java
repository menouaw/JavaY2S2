package fr.esgi.poo.java;

public class Main {
    public static void main(String[] args) {
        try {
            EvenNumber rtime = new EvenNumber(3);
        } catch (NotEvenNumberException e) {
            System.out.println(e.getMessage());
        }

        EvenNumber rtexception = new EvenNumber(3, false);
    }
}
