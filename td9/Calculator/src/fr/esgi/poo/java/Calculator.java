package fr.esgi.poo.java;

public class Calculator {

    private int sum;

    public Calculator() {
    }

    public int add(int... numbers) {
        sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public int multiply(int... numbers) {
        sum = 1;
        for (int number : numbers) {
            sum *= number;
        }

        if (numbers.length==0) {
            sum = 0;
        }

        return sum;
    }
}
