package fr.esgi.poo.java;

public class Ambiguous {
    private long a;
    private long b;

    public Ambiguous() {
    }

    public long calculate(int a, long b) {
        return 10*a+b;
    }

    public long calculate(long a, int b) {
        return 1000*a+b;
    }
}
