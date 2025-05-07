package EmployeeManagementSystem;

public class Developer extends Employee {
    String programmingLanguage;

    @Override
    public int calculateBonus() {
        int bonus = (int) (getSalary() * 0.15);
        return bonus;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

}
// Class Developer (inherits from Employee)
// Additional attribute: programmingLanguage (private, with getter & setter)
// Implements calculateBonus(): Bonus is 15% of the salary.
