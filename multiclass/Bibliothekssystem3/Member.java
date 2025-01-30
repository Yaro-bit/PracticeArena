package Bibliothekssystem3;

public class Member {
    String name;
     int memberId;
     int borrowedBooksCount;
    
    // Default constructor
    public Member() {
        this("name undefined", -1, 0); // Default values, 0 borrowed books
    }
    
    // Parameterized constructor
    public Member(String name, int memberId, int borrowedBooksCount) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooksCount = borrowedBooksCount;
    }
    
    // Getter and Setter methods for better encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getBorrowedBooksCount() {
        return borrowedBooksCount;
    }

    public void setBorrowedBooksCount(int borrowedBooksCount) {
        this.borrowedBooksCount = borrowedBooksCount;
    }

    // Method to borrow a book
    public void borrowBook() {
        borrowedBooksCount++;
    }

    // Method to return a book
    public void returnBook() {
        if (borrowedBooksCount > 0) {
            borrowedBooksCount--;
        }
    }
    
    @Override
    public String toString() {
        return "Member [name=" + name + ", memberId=" + memberId + ", borrowedBooksCount=" + borrowedBooksCount + "]";
    }
}
