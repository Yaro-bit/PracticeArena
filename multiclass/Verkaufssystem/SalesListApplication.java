package Verkaufssystem;

import java.util.Scanner;

public class SalesListApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nArtikel-System");
            System.out.println("1. Artikel hinzufügen");
            System.out.println("2. Alle Artikel anzeigen");
            System.out.println("3. Beenden");
            System.out.print("Wählen Sie eine Option (1-3): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Geben Sie Ihren Artikel ein: ");
                String article = scanner.nextLine();
                ArticleManager.input(article); 
                System.out.println("Artikel wurde hinzugefügt.");
            } else if (choice == 2) {
                System.out.println("\nAlle Artikel:");
                ArticleManager.display(); 
                System.out.println("Das Programm wird beendet.");
                scanner.close();
                break;
            } else {
                System.out.println("Ungültige Auswahl. Bitte wählen Sie eine Zahl zwischen 1 und 3.");
            }
        }
    }
}
