package LibrarySystem2;

public class Book {
    String title;
    String author;
    String isbn;
    boolean available;

    Book() {
        title = "Unknown";
        author = "Unknown";
        isbn = "unknown";
        available = false;
    }

    public Book(String title, String author, String isbn, boolean available) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = available;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + ", available=" + available + "]";
    }
}
