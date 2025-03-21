package fr.esgi.poo.java;

public class Multiply extends Sum {
    public Multiply(int x, int y) {
        super(x, y);
    }

    public int compute() {
        return x * y;
    }
}
