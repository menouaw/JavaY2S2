package fr.esgi.poo.java.lightning;

public class Main {
    public static void main(String[] args) {

        Lamp lightOne = new Lamp(true);
        Lamp lightTwo = new Lamp(false);
        Switch mySwitch = new Switch(lightOne, lightTwo);

        Lamp[] lights = {lightOne, lightTwo};
        for (Lamp light : lights) {
            System.out.println(light.toString());
            mySwitch.switchOff();
            System.out.println(light.toString());
            System.out.println();

        }

    }
}
