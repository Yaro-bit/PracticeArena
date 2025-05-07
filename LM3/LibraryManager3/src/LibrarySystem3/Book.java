package LibrarySystem3;

public class Book {
    String title;
    String author;
    String category;
    boolean isAvailable;
    
    public Book() {
        this("unknown title", "unknown author", "unknown category", false);
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
