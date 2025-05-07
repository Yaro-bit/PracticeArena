package EmployeeSystem;

import java.math.BigDecimal;
import java.util.ArrayList;

public class EmployeeManager {
    ArrayList<Employee> employees = new ArrayList<Employee>();

    public void addEmployee(Employee employee) { // Add an employee.
        employees.add(employee);
    }

    public void displayAllEmployees() { // Display all employees.
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            System.out.println(employee);
        }
    }

    public void searchEmployees(String name) { // Search employees by name.
        boolean found = false;
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            if (employee.getName().equalsIgnoreCase(name)) {
                System.out.println(employee);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employee found with name: " + name);
        }
    }

    public BigDecimal calculateAverageSalary() { // Calculate the average salary.
        if (employees.isEmpty()) {
            return BigDecimal.ZERO; 
        }

        BigDecimal totalSalary = BigDecimal.ZERO;
        for (Employee employee : employees) {
            totalSalary = totalSalary.add(employee.getSalary());
        }

        return totalSalary.divide(new BigDecimal(employees.size()));
    }
}
