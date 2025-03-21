package khatchatrian.menoua.classe2;

/**
 * Classe principale pour lancer l'application de liste de courses.
 */
public class Launcher {
    /**
     * Point d'entrée principal de l'application.
     *
     * @param args Arguments de la ligne de commande.
     */
    public static void main(String[] args) {
        System.out.println("Liste de courses: ");
        Articles[] articles = Articles.values();
        for (Articles article : articles) {
            System.out.printf("%s: %.2f€\n", article.getName(), article.getPrice());
        }

        System.out.println("\nListe de courses aléatoire: ");
        ListeDeCourses liste = new ListeDeCourses();
        liste.createList();
        liste.displayList();
        System.out.printf("Total: %.2f€\n", liste.getTotalAmount());

        System.out.println("\nListe de courses aléatoire sous " + ListeDeCourses.MAX_AMOUNT + "€: ");
        double total = liste.listUnderAmount(ListeDeCourses.MAX_AMOUNT);
        System.out.printf("Total: %.2f€\n", total);
    }
}