package fr.esgi.poo.java;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        Square carre = new Square(5);

        System.out.println("Surface du rectangle: " + rect.area());
        System.out.println("Périmètre du rectangle: " + rect.perimeter());

        System.out.println("Surface du carré: " + carre.area());
        System.out.println("Périmètre du rectangle: " + carre.perimeter());

    }
}
