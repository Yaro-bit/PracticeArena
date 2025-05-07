package EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Company {

    public List<Employee> employees;

    public Company() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public void showEmployees() {
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                Manager manager = (Manager) employee;
                
                System.out.println(
                        "\n"+
                        " Name: " + manager.getName() + "\n"+
                        " Age: " + manager.getAge() + "\n"+
                        " Salary: " + manager.getSalary() + "\n"+
                        " Bonus: " + manager.calculateBonus() + "\n"+
                        " Total Salary: " + (manager.calculateBonus() + manager.getSalary()) + "\n"+
                        " Department: " + (manager.getDepartment())
                        );
            }
            else if (employee instanceof Developer) {
                Developer developer = (Developer) employee;
                
                System.out.println(
                        "\n"+
                        " Name: " + developer.getName() + "\n"+
                        " Age: " + developer.getAge() + "\n"+
                        " Salary: " + developer.getSalary() + "\n"+
                        " Bonus: " + developer.calculateBonus() + "\n"+
                        " Total Salary: " + (developer.calculateBonus() + developer.getSalary()) + "\n"+
                        " Programming Language: " + (developer.getProgrammingLanguage())
                        );
                
            } else {
                System.out.println("Error in showEmployees(), case not handled");
            }
        }
    }
}
// Class Company
// Contains a list of employees (using ArrayList<Employee>)
// Methods:
//    addEmployee(Employee e): Adds an employee to the list.
//    showEmployees(): Displays all employees with their details and bonus.
