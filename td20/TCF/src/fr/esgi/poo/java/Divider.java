package fr.esgi.poo.java;

public class Divider {
    private int dividende;
    private int diviseur;

    public Divider(int dividente, int diviseur) {
        this.dividende = dividente;
        this.diviseur = diviseur;
    }

    public int divide() {
        try {
            return dividende / diviseur;
        } catch (Exception e) {
            System.out.println("[ERROR]: " + e.getMessage());
        }
        return 1;
    }
}
