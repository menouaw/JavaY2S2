package fr.esgi.poo.java.st;

/**
 * Classe pour créer des vélos
 * @author menou
 */
public class Bike {
    public static int defaultWheelCount = 0;

    private String label;
    private int wheelCount;

    /**
     * Créer un vélo avec son étiquette et son nombre de roues
     * @param label
     * @param wheelCount
     */
    public Bike(String label, int wheelCount) {
        this.label = label;
        this.wheelCount = wheelCount;
    }

    /**
     * Créer un vélo avec son étiquette
     * @param label
     */
    public Bike(String label) {
        this.label = label;
    }

    /**
     * Renvoie les informations du véol
     * @return
     */
    @Override
    public String toString() {
        return "Bike{" +
                "label='" + label + '\'' +
                ", wheelCount=" + wheelCount +
                ", defaultWheelCount=" + defaultWheelCount +
                '}';
    }

    public static void display(Bike bike) {
        System.out.println(bike);
    }
}
