package fr.esgi.poo.java;

public class Subtract extends Sum {

    public Subtract(int x, int y) {
        super(x, y);
    }

    public int compute() {
        return x - y;
    }
}
