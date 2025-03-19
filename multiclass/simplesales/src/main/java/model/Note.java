package model;

import java.time.LocalDateTime;

public class Note {
    private String text;             // Notiztext
    private LocalDateTime erstellt;  // Erstellungsdatum
    private LocalDateTime aktualisiert; // Letzte Aktualisierung

    // Konstruktor
    public Note(String text) {
        this.text = text;
        this.erstellt = LocalDateTime.now();
        this.aktualisiert = this.erstellt;
    }

    // Standard-Konstruktor für leere Notiz
    public Note() {
        this("");
    }

    // Getter
    public String getText() {
        return text;
    }

    public LocalDateTime getErstellt() {
        return erstellt;
    }

    public LocalDateTime getAktualisiert() {
        return aktualisiert;
    }

    // Setter mit automatischem Update-Zeitstempel
    public void setText(String text) {
        this.text = text;
        this.aktualisiert = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Note{" +
                "text='" + text + '\'' +
                ", erstellt=" + erstellt +
                ", aktualisiert=" + aktualisiert +
                '}';
    }
}
