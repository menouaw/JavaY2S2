package fr.esgi.poo.java.mc;

public class Point {
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 5;

    private int x;
    private int y;
    private int z;

    public Point(int x, int y, int z) {

        this.x = (x < MIN_VALUE || x > MAX_VALUE) ? 0 : x;
        this.y = (y < MIN_VALUE || y > MAX_VALUE) ? 0 : y;
        this.z = (z < MIN_VALUE || z > MAX_VALUE) ? 0 : z;
    }

    public Point() {
        x = 0;
        y = 0;
        z = 0;
    }

    public Point(int value) {
        x = value;
        y = value;
        z = value;
    }

    public Point(int value, int scalar) {
        x = value * scalar;
        y = value * scalar;
        z = value * scalar;
    }

    public void displayPoint() {
        System.out.printf("x: %d, y: %d, z: %d\n", x, y, z);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
