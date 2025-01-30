package Bibliothekssystem3;

import java.time.LocalDate;

public class Loan {
	String memberName;
	String bookTitle;
	LocalDate dueDate; //!! Date
	
	public Loan() {
		this("name undefined", "unknown",LocalDate.MIN );
	}
	public Loan(String memberName, String bookTitle, LocalDate dueDate) {
		this.memberName = memberName;
		this.bookTitle = bookTitle;
		this.dueDate = dueDate;
	}
	@Override
	public String toString() {		return "Member [memberName=" + memberName + ", bookTitle=" + bookTitle + ", dueDate=" + dueDate + "]";
	}
	public void setDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
	
}
//Loan: Repräsentiert einen Leihvorgang mit den Eigenschaften:
//    Mitgliedsname (memberName)
//    Buchtitel (bookTitle)
//    Rückgabedatum (dueDate, z. B. "2024-01-15").