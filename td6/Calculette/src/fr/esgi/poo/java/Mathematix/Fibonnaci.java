package fr.esgi.poo.java.Mathematix;

public class Fibonnaci {

    public double fibonnaci(double n) {
        if (n == 0) return 0d;
        if (n == 1) return 1d;
        return fibonnaci(n-1) + fibonnaci(n-2);
    }

    public double fibonnaci_rec(double n, double a, double b) {
        if (n == 0) return a;
        return fibonnaci_rec(n-1, b, a+b);
    }
}
