package fr.esgi.poo.java;

public class Circle implements Areable {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int computeArea() {
        return (int) (Math.PI * Math.pow(radius, 2));
    }
}
