package Bibliothekssystem1;

import java.io.Serializable;

public class Book implements Serializable {
    
	private static final long serialVersionUID = 1L;
	
	String titel;
	String autor;
	int isbn;
	boolean verfügbar;

	public Book() {
		this("title unknown", "author unknown", -1 ,false);
	}

	public Book(String titel, String autor, int isbn, boolean verfügbar) {
		this.titel = titel;
		this.autor = autor;
		this.isbn = isbn;
		this.verfügbar = verfügbar;
	}

	@Override
	public String toString() {
		return "Book [titel=" + titel + ", autor=" + autor + ", isbn=" + isbn + ", verfügbar=" + verfügbar + "]";
	}

}
//Datenmodellierung in einer Klasse: Modellieren Sie eine Klasse `Buch` mit den Attributen `titel`,
//`autor`, `isbn` und `verfügbar`.