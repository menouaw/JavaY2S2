package fr.esgi.poo.java;

public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();
        Triangle tri1 = new Triangle();
        Circle cir1 = new Circle();
        Square sq1 = new Square();

        rect1.draw();
        rect2.draw();
        tri1.draw();
        cir1.draw();

        System.out.println("Tableau");
        Shape[] shapes = new Shape[5];
        shapes[0] = rect1;
        shapes[1] = rect2;
        shapes[2] = tri1;
        shapes[3] = cir1;
        shapes[4] = sq1;

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
