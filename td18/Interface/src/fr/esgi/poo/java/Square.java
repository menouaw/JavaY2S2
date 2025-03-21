package fr.esgi.poo.java;

public class Square implements Areable {
    private int height;
    private int width;

    public Square(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int computeArea() {
        return height * width;
    }
}
