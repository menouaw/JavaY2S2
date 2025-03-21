package fr.esgi.poo.java.sample;

public class Launcher {
    public static void main(String[] args) {
        MySample toto = new MySample(42);

        System.out.printf("Coucou %d\n", toto.myNumber);

        toto.myInt = 3;

        System.out.println(toto.isOK());
        toto.setOK(true);
        System.out.printf("%s", toto.isOK());
    }
}