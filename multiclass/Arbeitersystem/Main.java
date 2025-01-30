package Arbeitersystem;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManager employeeManager = new EmployeeManager();
        
        while (true) {
            System.out.println("\nMitarbeiterverwaltungs-System");
            System.out.println("1. Mitarbeiter hinzufügen");
            System.out.println("2. Alle Mitarbeiter anzeigen");
            System.out.println("3. Mitarbeiter nach Namen suchen");
            System.out.println("4. Durchschnittsgehalt berechnen");
            System.out.println("5. Beenden");
            System.out.print("Wählen Sie eine Option (1-5): ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Eingabepuffer leeren
            
            if (choice == 1) {
                System.out.print("Name des Mitarbeiters: ");
                String name = scanner.nextLine();
                System.out.print("Abteilung des Mitarbeiters: ");
                String department = scanner.nextLine();
                System.out.print("Gehalt des Mitarbeiters: ");
                BigDecimal salary = new BigDecimal(scanner.nextLine());

                Employee employee = new Employee(name, department, salary);
                employeeManager.addEmployee(employee);
                System.out.println("Mitarbeiter wurde hinzugefügt.");
            } else if (choice == 2) {
                // Alle Mitarbeiter anzeigen
                System.out.println("\nAlle Mitarbeiter:");
                employeeManager.displayAllEmployees();
            } else if (choice == 3) {
                // Mitarbeiter nach Namen suchen
                System.out.print("Geben Sie den Namen des Mitarbeiters ein, den Sie suchen möchten: ");
                String searchName = scanner.nextLine();
                employeeManager.searchEmployees(searchName);
            } else if (choice == 4) {
                // Durchschnittsgehalt berechnen
                BigDecimal avgSalary = employeeManager.calculateAverageSalary();
                System.out.println("Durchschnittsgehalt: " + avgSalary);
            } else if (choice == 5) {
                // Beenden
                System.out.println("Das Programm wird beendet.");
                scanner.close();
                break; // Programm beenden
            } else {
                System.out.println("Ungültige Auswahl. Bitte wählen Sie eine Zahl zwischen 1 und 5.");
            }
        }
    }
}
