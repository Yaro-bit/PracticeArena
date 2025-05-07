package itemSystem;

import java.util.Scanner;

public class ListApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nItem System");
            System.out.println("1. Add Item");
            System.out.println("2. Display All Items");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1-3): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter your item: ");
                String item = scanner.nextLine();
                ArticleManager.input(item); 
                System.out.println("Item has been added.");
            } else if (choice == 2) {
                System.out.println("\nAll Items:");
                ArticleManager.display(); 
                System.out.println("The program will now exit.");
                scanner.close();
                break;
            } else {
                System.out.println("Invalid selection. Please choose a number between 1 and 3.");
            }
        }
    }
}
