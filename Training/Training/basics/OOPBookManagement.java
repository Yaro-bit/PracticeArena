// Wiederholungen könnten durch generische Filtermethoden vermieden werden.

package basics;

public class OOPBookManagement {

	public static void main(String[] args) {

	Filter.filterByGenre("Fiction");
	System.out.println();
	Filter.filterByAvailability(false);
	System.out.println();
	Filter.filterBySide(96);

	}

}

class Filter {
	static Book books[] = { new Book("Der Herr der Ringe", "J.R.R. Tolkien", "Fiction", 1200, true),
			new Book("Sapiens", "Yuval Noah Harari", "Science", 498, true),
			new Book("Die Physiker", "Friedrich Dürrenmatt", "Drama", 128, false),
			new Book("1984", "George Orwell", "Fiction", 328, true),
			new Book("Eine kurze Geschichte der Zeit", "Stephen Hawking", "Science", 256, false),
			new Book("Die Verwandlung", "Franz Kafka", "Fiction", 96, true),
			new Book("Steve Jobs", "Walter Isaacson", "Biography", 656, true),
			new Book("Der kleine Prinz", "Antoine de Saint-Exupéry", "Fiction", 96, true),
			new Book("Astrophysik für Eilige", "Neil deGrasse Tyson", "Science", 224, false),
			new Book("Faust", "Johann Wolfgang von Goethe", "Drama", 448, true) };

	public static void filterByGenre(String genre) {
		for (int i = 0; i < books.length; i++) {
			Book currentBook = books[i];
			if (currentBook.genre.equals(genre)) {
                System.out.println(currentBook);
            }
		}
	}
	public static void filterByAvailability(boolean verfügbarkeit) {
		for (int i = 0; i < books.length; i++) {
			Book currentBook = books[i];
			if (currentBook.verfügbarkeit == (verfügbarkeit)) {
                System.out.println(currentBook);
            }
		}
	}
	
	public static void filterBySide(int seitenanzahl) {
		for (int i = 0; i < books.length; i++) {
			Book currentBook = books[i];
			if (currentBook.seitenanzahl == (seitenanzahl)) {
                System.out.println(currentBook);
            }
		}
	}
}

class Book {
	String titel;
	String autor;
	String genre;
	int seitenanzahl;
	boolean verfügbarkeit;

	public Book() {
		this("Titel Unbekannt", "Autor Unbekannt", "Genre Unbekannt", -1, false);
	}

	public Book(String titel, String autor, String genre, int seitenanzahl, boolean verfügbarkeit) {
		this.titel = titel;
		this.autor = autor;
		this.genre = genre;
		this.seitenanzahl = seitenanzahl;
		this.verfügbarkeit = verfügbarkeit;
	}

	@Override
	public String toString() {
		return "Book [titel=" + titel + ", autor=" + autor + ", genre=" + genre + ", seitenanzahl=" + seitenanzahl
				+ ", verfügbarkeit=" + verfügbarkeit + "]";
	}

}
//Aufgabe: LibraryBookManagement - Erstelle eine Java-Anwendung, um Bücher in einer kleinen Bibliothek zu verwalten.
//Anforderungen:
//    Filter nach Genre: - Finde alle Bücher eines bestimmten Genres (z. B. "Fiction", "Science", "Biography").
//    Filter nach Seitenzahl: -  Zeige alle Bücher, deren Seitenanzahl mindestens X beträgt.   
//    Filter nach Verfügbarkeit: - Zeige alle Bücher, die derzeit verfügbar sind.
//