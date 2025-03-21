package fr.esgi.poo.java;

public class Rectangle {
    private int largeur;
    private int longueur;

    public Rectangle(int largeur, int longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    public int area() {
        return this.largeur * this.longueur;
    }

    public int perimeter() {
        return 2 * (this.largeur + this.longueur);
    }
}
