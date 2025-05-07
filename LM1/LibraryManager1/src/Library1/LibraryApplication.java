package Library1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class LibraryApplication {
    public static void main(String[] args) {
        // ArrayList with Book objects
        ArrayList<Book> bookList = new ArrayList<>();

        // Add books to the list
        bookList.add(new Book("Advanced Java", "Jane Smith", 12345, true));
        bookList.add(new Book("Easy Java", "Jane Doe", 56789, false));
        bookList.add(new Book("Rookie Java", "John Brown", 98765, true));

        // File where the books will be stored
        String fileName = "library.dat";

        // Save book list (Serialization)
        save(bookList, fileName);

        // Load book list (Deserialization)
        ArrayList<Book> loadedBookList = load(fileName);

        // Display loaded books
        System.out.println("Loaded books from file:");
        for (Book book : loadedBookList) {
            System.out.println(book);
        }
    }

    // Method to save (Serialization)
    public static void save(ArrayList<Book> bookList, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(bookList); // Serialize book list
            System.out.println("Book list successfully saved in: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to load (Deserialization)
    @SuppressWarnings("unchecked")
    public static ArrayList<Book> load(String fileName) {
        ArrayList<Book> bookList = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            bookList = (ArrayList<Book>) ois.readObject(); // Deserialize book list
            System.out.println("Book list successfully loaded from file.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return bookList;
    }
}
