package khatchatrian.menoua.classe2;

import java.util.Random;

/**
 * Enumération représentant les différents articles disponibles.
 */
public enum Articles {
    PATES("Paquet de pâtes", getRandomPrice()),
    LAIT("Bouteille de lait", getRandomPrice()),
    FROMAGE("Fromage", getRandomPrice()),
    YAOURT("Yaourt", getRandomPrice()),
    TOMATE("Tomate", getRandomPrice()),
    EAU("Bouteille d'eau", getRandomPrice()),
    POISSON("Filet de poisson", getRandomPrice()),
    OEUFS("Oeuf", getRandomPrice()),
    BANANE("Banane", getRandomPrice()),
    PAIN("Pain", getRandomPrice());

    private String name;
    private double price;

    public static final int MAX_PRICE = 11;
    public static final int MIN_PRICE = 2;

    /**
     * Constructeur de l'énumération Articles.
     *
     * @param name  Le nom de l'article.
     * @param price Le prix de l'article.
     */
    Articles(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Retourne le nom de l'article.
     *
     * @return Le nom de l'article.
     */
    public String getName() {
        return name;
    }

    /**
     * Retourne le prix de l'article.
     *
     * @return Le prix de l'article.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Génère un prix aléatoire pour un article.
     *
     * @return Un prix aléatoire.
     */
    private static double getRandomPrice() {
        Random rand = new Random();
        return rand.nextFloat(MAX_PRICE - MIN_PRICE) + MIN_PRICE;
    }
}