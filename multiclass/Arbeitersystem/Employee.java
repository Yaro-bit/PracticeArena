package Arbeitersystem;

import java.math.BigDecimal;

public class Employee {

	private String name;
	private String department;
	private BigDecimal salary;

	Employee() {
		name = "unbekannt";
		department = "unbekannt";
		salary = BigDecimal.ZERO;
	}

	Employee(String name, String department, BigDecimal salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("Employee{name='%s', department='%s', salary=%s}", name, department, salary);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		if (salary.compareTo(BigDecimal.ZERO) < 0) {
			throw new IllegalArgumentException("Salary cannot be negative");
		}
		this.salary = salary;
	}
	public int compareTo(Employee other) {
	    return this.salary.compareTo(other.salary);
	}

}
// Felder: name, department, salary (privat, mit Getter/Setter).