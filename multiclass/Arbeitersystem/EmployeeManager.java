package Arbeitersystem;

import java.math.BigDecimal;
import java.util.ArrayList;

public class EmployeeManager {
	ArrayList<Employee> employees = new ArrayList<Employee>();

	public void addEmployee(Employee employee) { // Mitarbeiter hinzufügen.
		employees.add(employee);
	}

	public void displayAllEmployees() {
		for (int i = 0; i < employees.size(); i++) { // Alle Mitarbeiter anzeigen.
			Employee employee = employees.get(i);
			System.out.println(employee);
		}
	}

	public void searchEmployees(String name) { // Mitarbeiter nach Namen suchen.
		boolean found = false;
		for (int i = 0; i < employees.size(); i++) {
			Employee employee = employees.get(i);
			if (employee.getName().equalsIgnoreCase(name)) {
				System.out.println(employee);
				found = true;
			}
		}
		if (found != true) {
			System.out.println("No employee found with name: " + name);
		}

	}

	public BigDecimal calculateAverageSalary() { //    Durchschnittsgehalt berechnen.
		if (employees.isEmpty()) {
			return BigDecimal.ZERO; //  
		}

		BigDecimal totalSalary = BigDecimal.ZERO;
		for (Employee employee : employees) {
			totalSalary = totalSalary.add(employee.getSalary());
		}

		return totalSalary.divide(new BigDecimal(employees.size()));
	}
}
//2. Klasse EmployeeManager:
//	Verwaltet die Liste der Mitarbeiter (ArrayList<Employee>).
//	  Implementiert Funktionen:
//    Mitarbeiter hinzufügen.
//    Alle Mitarbeiter anzeigen.
//    Mitarbeiter nach Namen suchen.
//    Durchschnittsgehalt berechnen.