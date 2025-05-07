package EmployeeManagementSystem;

public class Main {
    public static void main(String[] args) {
        // Create a company
        Company company = new Company();

        // Create Manager and Developer objects
        Manager manager = new Manager();
        manager.setName("John Doe");
        manager.setAge(45);
        manager.setSalary(70000);
        manager.setDepartment("IT");

        Developer developer = new Developer();
        developer.setName("Jane Smith");
        developer.setAge(30);
        developer.setSalary(50000);
        developer.setProgrammingLanguage("Java");

        // Add employees to the company
        company.addEmployee(manager);
        company.addEmployee(developer);

        // Show all employees with their details and bonuses
        company.showEmployees();

        // Optionally, calculate the total salary cost
        // company.totalSalaryCost(); // This method can be added to the Company class
    }
}
