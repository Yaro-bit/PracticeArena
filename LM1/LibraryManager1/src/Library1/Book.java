package Library1;

import java.io.Serializable;

public class Book implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    String title;
    String author;
    int isbn;
    boolean available;

    public Book() {
        this("title unknown", "author unknown", -1, false);
    }

    public Book(String title, String author, int isbn, boolean available) {
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
//Data modeling in a class: Model a `Book` class with attributes `title`, `author`, `isbn`, and `available`.
