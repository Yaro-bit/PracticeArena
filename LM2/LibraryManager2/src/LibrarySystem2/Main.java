package LibrarySystem2;

public class Main {
    public static void main(String[] args) {
        Book books[] = {
            new Book("Java for Beginners", "Daniel Varga", "ISBN123824", true),
            new Book("Advanced Java", "Daniel Varga", "ISBN123825", true),
            new Book("Thinking in Java", "Yaroslav Woll", "ISBN123826", true)
        };

        Contact contacts[] = {
            new Contact("John Doe", "+1234567890", "johndoe@example.com", "Unknown Address")
        };

        for (Book book : books) {
            System.out.println(book);
        }

        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}
