package Bibliothekssystem3;

public class Book {
	String title;
	String author;
	String category;
	boolean isAvailable;
	
	public Book() {
		this("title unknown", "author unknown", "category unknown",false);
	}
	public Book(String title, String author, String category, boolean isAvailable) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.isAvailable = isAvailable;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", category=" + category + ", isAvailable="
				+ isAvailable + "]";
	}
	
}
//Book: Repräsentiert ein Buch mit den Eigenschaften:
//    Titel (title)
//    Autor (author)
//    Kategorie (category, z. B. "Fiction", "Science", "History")
//    Verfügbarkeit (isAvailable, true oder false).