package LibrarySystem3;

import java.time.LocalDate;

public class LibraryApplication {

    public static void main(String[] args) {
        // Test StringManipulator (static methods only)
        try {
            String title = "example title";
            String name = "example name";
            System.out.println("Title in uppercase: " + StringManipulator.toUpperCaseTitle(title));
            System.out.println("Formatted name: " + StringManipulator.toUpperCaseName(name));
        } catch (Exception e) {
            System.out.println("Error in StringManipulator: " + e.getMessage());
        }

        // Test Book
        try {
            Book book = new Book("Java Basics", "John Doe", "Science", true);
            System.out.println("Book: " + book);
        } catch (Exception e) {
            System.out.println("Error in Book: " + e.getMessage());
        }

        // Test Filter
        try {
            System.out.println("\nBooks in category 'Science':");
            Filter.filterBooksByCategory("Science");

            System.out.println("\nAvailable books:");
            Filter.filterBooksByAvailability(true);

            System.out.println("\nMembers named 'Alice':");
            Filter.filterMembersByName("Alice");

            System.out.println("\nLoans by member 'Alice':");
            Filter.filterLoansByMember("Alice");
        } catch (Exception e) {
            System.out.println("Error in Filter: " + e.getMessage());
        }

        // Display all books, members, and loans in Data
        try {
            System.out.println("\nAll books in Data:");
            for (Book book : Data.books) {
                System.out.println(book);
            }

            System.out.println("\nAll members in Data:");
            for (Member member : Data.members) {
                System.out.println(member);
            }

            System.out.println("\nAll loans in Data:");
            for (Loan loan : Data.loans) {
                System.out.println(loan);
            }
        } catch (Exception e) {
            System.out.println("Error in Data: " + e.getMessage());
        }

        // Test Loan
        try {
            Loan loan = new Loan("Alice", "Java Basics", LocalDate.of(2024, 1, 15));
            System.out.println("\nLoan: " + loan);
        } catch (Exception e) {
            System.out.println("Error in Loan: " + e.getMessage());
        }

        // Test Member
        try {
            Member member = new Member("Alice", 1, 2);
            System.out.println("\nMember: " + member);
        } catch (Exception e) {
            System.out.println("Error in Member: " + e.getMessage());
        }

        // Simulate seating plan
        simulateSeatingPlan();
    }

    // Method for seating plan simulation
    public static void simulateSeatingPlan() {
        // 2D Array for seating plan (3 rooms with 5 seats each)
        String[][] seating = new String[3][5];

        // Initialize the array with "Free"
        for (int i = 0; i < seating.length; i++) {
            for (int j = 0; j < seating[i].length; j++) {
                seating[i][j] = "Free";
            }
        }

        // Assign members to seats based on their IDs
        int memberIndex = 0;
        for (int i = 0; i < seating.length && memberIndex < Data.members.length; i++) {
            for (int j = 0; j < seating[i].length && memberIndex < Data.members.length; j++) {
                seating[i][j] = Data.members[memberIndex].getName();
                memberIndex++;
            }
        }

        // Display seating plan
        System.out.println("\nSeating plan of reading rooms:");
        for (int i = 0; i < seating.length; i++) {
            System.out.print("Room " + (i + 1) + ": ");
            for (int j = 0; j < seating[i].length; j++) {
                System.out.print(seating[i][j] + " ");
            }
            System.out.println();
        }
    }
}
