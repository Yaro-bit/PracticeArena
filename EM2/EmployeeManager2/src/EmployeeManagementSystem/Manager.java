package EmployeeManagementSystem;

public class Manager extends Employee {
    private String department;

    @Override
    public int calculateBonus() {
        int bonus = (int) (getSalary() * 0.2);
        return bonus;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
// Class Manager (inherits from Employee)
// Additional attribute: department (private, with getter & setter)
// Implements calculateBonus(): Bonus is 20% of the salary.
