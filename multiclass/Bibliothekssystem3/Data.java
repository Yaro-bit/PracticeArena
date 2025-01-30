package Bibliothekssystem3;

import java.time.LocalDate;

public class Data {
	static Book[] books = new Book[] { new Book("Java Basics", "John Doe", "Science", true),
			new Book("Advanced Java", "Jane Smith", "Science", false),
			new Book("Python for Beginners", "Alice Brown", "Science", true),
			new Book("Data Science 101", "Bob White", "Science", false),
			new Book("World History", "Charlie Black", "History", true),
			new Book("Fictional Worlds", "David Green", "Fiction", true),
			new Book("Algorithms Explained", "Emily Gray", "Science", true),
			new Book("Database Design", "Frank Yellow", "Science", false),
			new Book("Medieval Europe", "Grace Blue", "History", true),
			new Book("Mystery Tales", "Hannah Pink", "Fiction", true) };
	static Member[] members = new Member[] { new Member("Alice", 1, 2), new Member("Bob", 2, 1),
			new Member("Charlie", 3, 0), new Member("Diana", 4, 1), new Member("Eve", 5, 0) };
	static Loan[] loans = new Loan[] { new Loan("Alice", "Advanced Java", LocalDate.of(2024, 01, 15)),
			new Loan("Bob", "Data Science 101", LocalDate.of(2024, 01, 20)),
			new Loan("Diana", "Database Design", LocalDate.of(2024, 02, 01))

	};
}
