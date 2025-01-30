package Bibliothekssystem2;

public class Book {
	String titel;
	String autor;
	String isbn;
	boolean avail;

	Book() {
		titel = "Unbekannt";
		autor = "Unbekannt";
		isbn = "unbekannt";
		avail = false;
	}

	public Book(String titel, String autor, String isbn, boolean avail) {
		this.titel = titel;
		this.autor = autor;
		this.isbn = isbn;
		this.avail = avail;
	}

	@Override
	public String toString() {
		return "Book [titel=" + titel + ", autor=" + autor + ", isbn=" + isbn + ", avail=" + avail + "]";
	}


}
