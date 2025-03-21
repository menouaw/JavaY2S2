package fr.esgi.poo.java.helloworld;

public class HelloWorld {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.printf("Hello World!");
        } else {
            String name = args[0];
            System.out.printf("Hello %s!", name);
        }
    }
}