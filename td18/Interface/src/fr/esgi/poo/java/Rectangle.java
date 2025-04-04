package fr.esgi.poo.java;

public class Rectangle implements Areable {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int computeArea() {
        return height * width;
    }
}
