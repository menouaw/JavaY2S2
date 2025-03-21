package fr.esgi.poo.java;

public class Main {
    public static void main(String[] args) {
        GrandFather gf = new GrandFather();
        Father f = new Father();
        Son s = new Son();

        System.out.println("Grandfather: " + gf.nameLength() + ", type: " + (gf instanceof GrandFather));
        System.out.println("Father: " + f.nameLength() + ", type: " + (f instanceof Father));
        System.out.println("Son: " + s.nameLength() + ", type: " + (s instanceof GrandFather));
    }
}
