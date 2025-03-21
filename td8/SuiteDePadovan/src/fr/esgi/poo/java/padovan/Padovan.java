package fr.esgi.poo.java.padovan;

public class Padovan {
    private static final int MAX = 20;

    int[] numbers = new int[MAX];

    public void padovanFor() {
            numbers[0] = numbers[1] = numbers[2] = 1;

        for (int i = 3; i < numbers.length-1; i++) {
            numbers[i] = numbers[i-2] + numbers[i-3];
        }
    }

    public void display() {
        for (int i = 0; i < numbers.length-1; i++) {
            System.out.println(numbers[i]);
        }
    }
}
