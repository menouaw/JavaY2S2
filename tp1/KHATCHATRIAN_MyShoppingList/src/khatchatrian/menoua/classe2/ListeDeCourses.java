package khatchatrian.menoua.classe2;

/**
 * Classe représentant une liste de courses.
 */
public class ListeDeCourses {
    public String[] articles;
    public double[] prices;

    public static final int MAX_ITEMS = 15;
    public static final double MAX_AMOUNT = 50.;

    /**
     * Constructeur par défaut initialisant les tableaux d'articles et de prix.
     */
    public ListeDeCourses() {
        this.articles = new String[MAX_ITEMS];
        this.prices = new double[MAX_ITEMS];
    }

    /**
     * Crée une liste de courses aléatoire.
     */
    public void createList() {
        Articles[] allArticles = Articles.values();
        int nbItems = (int) (Math.random() * MAX_ITEMS) + 1;
        for (int i = 0; i < nbItems; i++) {
            int index = (int)(Math.random() * allArticles.length);
            this.articles[i] = allArticles[index].getName();
            this.prices[i] = allArticles[index].getPrice();
        }
    }

    /**
     * Affiche la liste de courses.
     */
    public void displayList() {
        for (int i = 0; i < this.articles.length; i++) {
            if (this.articles[i] != null) {
                System.out.printf("%s: %.2f€\n", this.articles[i], this.prices[i]);
            }
        }
    }

    /**
     * Calcule le montant total de la liste de courses.
     *
     * @return Le montant total.
     */
    public double getTotalAmount() {
        double total = 0;
        for (int i = 0; i < this.articles.length; i++) {
            if (this.articles[i] != null) {
                total += this.prices[i];
            }
        }
        return total;
    }

    /**
     * Affiche les articles dont le montant total est inférieur à un certain montant.
     *
     * @param amount Le montant maximum.
     * @return Le montant total des articles affichés.
     */
    public double listUnderAmount(double amount) {
        double total = 0;
        for (int i = 0; i < this.articles.length; i++) {
            if (this.articles[i] != null) {
                if (total + this.prices[i] <= amount) {
                    total += this.prices[i];
                    System.out.printf("%s: %.2f€\n", this.articles[i], this.prices[i]);
                }
            }
        }
        return total;
    }
}