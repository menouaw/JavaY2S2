package fr.esgi.poo.java.st;

public class Main {
    public static void main(String[] args) {
        Bike bikeOne = new Bike("Monocycle", 1);
        Bike bikeTwo = new Bike("Bicycle", 2);
        Bike bikeThree = new Bike("Tricycle", 3);

        Bike[] bikes = {bikeOne, bikeTwo, bikeThree};
        for(Bike bike : bikes) {
            System.out.println(bike);
            Bike.defaultWheelCount += 1;
            Bike.display(bike);
            System.out.println();
        }

    }
}
