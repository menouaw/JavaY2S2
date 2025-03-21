package fr.esgi.poo.java;

public class Main {
    public static void main(String[] args) {
        Square sq1 = new Square(2, 5);
        Square sq2 = new Square(3, 6);
        Rectangle rect1 = new Rectangle(1, 4);
        Rectangle rect2 = new Rectangle(7, 8);
        Circle cir1 = new Circle(20);


        Areable[] shapes = new Areable[5];
        shapes[0] = sq1;
        shapes[1] = sq2;
        shapes[2] = rect1;
        shapes[3] = rect2;
        shapes[4] = cir1;
        for (Areable shape : shapes) {
            System.out.println(shape.computeArea());
        }

    }
}
