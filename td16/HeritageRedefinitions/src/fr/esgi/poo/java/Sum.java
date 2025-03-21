package fr.esgi.poo.java;

public class Sum {
    protected int x;
    protected int y;

    public Sum(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int compute() {
        return x + y;
    }
}
