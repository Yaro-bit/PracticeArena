package EmployeeManagementSystem;

abstract class Employee {
    String name;
    int age;
    int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public abstract int calculateBonus();
}
// Abstract class Employee
// Attributes: name, age, salary (private, with getter & setter)
// Abstract method calculateBonus(), which calculates the employee's bonus.
