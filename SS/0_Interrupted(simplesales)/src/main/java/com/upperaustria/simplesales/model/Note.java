package com.upperaustria.simplesales.model;

public class Note {
    private String content; // Der Inhalt der Notiz

    // Konstruktor
    public Note() {
        this.content = ""; // Standardinhalt der Notiz ist leer
    }

    // Getter und Setter
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Note{" +
                "content='" + content + '\'' +
                '}';
    }
}
