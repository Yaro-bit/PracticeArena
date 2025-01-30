package Bibliothekssystem1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class BibliothekApplikation {
    public static void main(String[] args) {
        // ArrayList mit Book-Objekten
        ArrayList<Book> bücherListe = new ArrayList<>();

        // Bücher zur Liste hinzufügen
        bücherListe.add(new Book("Advanced Java", "Jane Smith", 12345, true));
        bücherListe.add(new Book("Easy Java", "Jane Doe", 56789, false));
        bücherListe.add(new Book("Rookie Java", "John Brown", 98765, true));

        // Datei, in der die Bücher gespeichert werden
        String dateiName = "bibliothek.dat";

        // Bücherliste speichern (Serialisierung)
        speichern(bücherListe, dateiName);

        // Bücherliste laden (Deserialisierung)
        ArrayList<Book> geladeneBücherListe = laden(dateiName);

        // Geladene Bücher anzeigen
        System.out.println("Geladene Bücher aus der Datei:");
        for (Book buch : geladeneBücherListe) {
            System.out.println(buch);
        }
    }

    // Methode zum Speichern (Serialisierung)
    public static void speichern(ArrayList<Book> bücherListe, String dateiName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dateiName))) {
            oos.writeObject(bücherListe); // Bücherliste serialisieren
            System.out.println("Bücherliste erfolgreich gespeichert in: " + dateiName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Methode zum Laden (Deserialisierung)
    @SuppressWarnings("unchecked")
    public static ArrayList<Book> laden(String dateiName) {
        ArrayList<Book> bücherListe = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(dateiName))) {
            bücherListe = (ArrayList<Book>) ois.readObject(); // Bücherliste deserialisieren
            System.out.println("Bücherliste erfolgreich aus der Datei geladen.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return bücherListe;
    }
}
