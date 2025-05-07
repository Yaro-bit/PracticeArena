package basics;

import java.util.Arrays;

public class FootballField {
    static int l = 11;
    static int h = 7;

    static char[][] field = new char[l][h];

    // Constructor
    public FootballField() {
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < h; j++) {
                field[i][j] = 'E';
            }
        }
    }

    public static void main(String[] args) {
        FootballField ff = new FootballField(); // Instantiate the object

        char p = 'P'; // Player
        char t = 'T'; // Goalkeeper

        // Random positions for player and goalkeeper
        int ranLPlayer = (int) (Math.random() * l);
        int ranHPlayer = (int) (Math.random() * h);
        int ranLGoalkeeper = (int) (Math.random() * l);
        int ranHGoalkeeper = (int) (Math.random() * h);

        // Place player and goalkeeper on the field
        field[ranLPlayer][ranHPlayer] = p;
        field[ranLGoalkeeper][ranHGoalkeeper] = t;

        // Output the field
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < h; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }
}


//Erstelle ein 2D-Array mit 11 Reihen und 7 Spalten (z.B. char[][] feld = new char[11][7];).
//Fülle das Array zunächst mit dem Buchstaben "E" (für leeres Feld).
//Platziere zufällig 11 "P" (für Spieler) in das Array. Achte darauf, dass keine Position doppelt belegt wird.
//Platziere zufällig ein "T" (für Torwart) an einer freien Stelle.
//Gib das Fußballfeld am Ende in einer gut lesbaren Form aus.