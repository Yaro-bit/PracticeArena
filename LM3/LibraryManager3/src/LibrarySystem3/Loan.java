package LibrarySystem3;

import java.time.LocalDate;

public class Loan {
    String memberName;
    String bookTitle;
    LocalDate dueDate; //!! Date
    
    // Default constructor
    public Loan() {
        this("name undefined", "unknown", LocalDate.MIN );
    }
    
    // Constructor with parameters
    public Loan(String memberName, String bookTitle, LocalDate dueDate) {
        this.memberName = memberName;
        this.bookTitle = bookTitle;
        this.dueDate = dueDate;
    }

    // Override toString method to display loan details
    @Override
    public String toString() {
        return "Member [memberName=" + memberName + ", bookTitle=" + bookTitle + ", dueDate=" + dueDate + "]";
    }
    
    // Method to set due date
    public void setDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
