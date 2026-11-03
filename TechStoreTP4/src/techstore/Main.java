package techstore;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> noms = new ArrayList<String>();
        ArrayList<Double> prix = new ArrayList<Double>();
        ArrayList<Long> quantites = new ArrayList<Long>();

        noms.add("PC Portable Dell Vostro 3500");
        prix.add(1999.0);
        quantites.add(10L);

        noms.add("Écouteur JBL T125BT");
        prix.add(129.0);
        quantites.add(25L);

        noms.add("Smartphone INFINIX Hot 10");
        prix.add(439.0);
        quantites.add(15L);

        noms.add("Micro Casque 588 Filaire");
        prix.add(9.9);
        quantites.add(50L);

        noms.add("Smartphone NOKIA C1");
        prix.add(185.0);
        quantites.add(20L);

        Stock stock = new Stock(noms, prix, quantites);

        System.out.println("0: Gérant");
        System.out.println("1: Client");
        System.out.print("Votre choix : ");
        int c = scanner.nextInt();

        if (c == 0) {
            int choix = -1;
            while (choix != 5) {
                System.out.println("\n========== GESTION DU STOCK TECHSTORE ==========");
                System.out.println("0 - Ajouter un article");
                System.out.println("1 - Augmenter la quantité d'un article");
                System.out.println("2 - Modifier un article");
                System.out.println("3 - Supprimer un article");
                System.out.println("4 - Consulter le stock");
                System.out.println("5 - Quitter");
                System.out.print("Votre choix : ");
                choix = scanner.nextInt();

                if (choix == 0) {
                    scanner.nextLine();
                    System.out.print("Donner le nom du produit : ");
                    String nom = scanner.nextLine();
                    System.out.print("Donner le prix du produit : ");
                    double p = scanner.nextDouble();
                    System.out.print("Donner la quantité : ");
                    long q = scanner.nextLong();
                    stock.ajouterArticle(nom, p, q);
                    System.out.println("Article ajouté avec succès.");

                } else if (choix == 1) {
                    scanner.nextLine();
                    System.out.print("Donner la référence de l'article : ");
                    String ref = scanner.nextLine();
                    System.out.print("Donner la quantité à ajouter : ");
                    long q = scanner.nextLong();
                    stock.incrementerQuantiteArticle(ref, q);

                } else if (choix == 2) {
                    scanner.nextLine();
                    System.out.print("Donner la référence de l'article à modifier : ");
                    String ref = scanner.nextLine();
                    System.out.print("Donner le nouveau nom : ");
                    String nom = scanner.nextLine();
                    System.out.print("Donner le nouveau prix : ");
                    double p = scanner.nextDouble();
                    System.out.print("Donner la nouvelle quantité : ");
                    long q = scanner.nextLong();
                    stock.modifierArticle(ref, nom, p, q);

                } else if (choix == 3) {
                    scanner.nextLine();
                    System.out.print("Donner la référence de l'article à supprimer : ");
                    String ref = scanner.nextLine();
                    stock.supprimerArticle(ref);

                } else if (choix == 4) {
                    System.out.println("\n--- Stock actuel ---");
                    System.out.println(stock.toString());

                } else if (choix == 5) {
                    System.out.println("Au revoir !");
                } else {
                    System.out.println("Choix invalide.");
                }
            }
        } else if (c == 1) {
            System.out.println("Bonjour cher/chère client(e)");
            System.out.println("\n--- Articles disponibles ---");
            System.out.println(stock.toString());
        } else {
            System.out.println("Cette action n'est pas autorisée");
        }

        scanner.close();
    }
}