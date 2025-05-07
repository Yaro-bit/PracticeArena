package basics;


import java.util.Arrays;

public class ArrayRotation {

    public static void main(String[] args) {
        int array[][] = { 
            { 1, 1, 1, 1 }, 
            { 2, 2, 2, 2 }, 
            { 3, 3, 3, 3 }, 
            { 4, 4, 4, 4 } 
        };       
        System.out.println("Original Array:");
        print(array); 
        array = rotate(array, true);
        print(array);
    }

    public static int[][] rotate(int values[][], boolean rotateLeft) {
        // Breite des Arrays (Anzahl der Spalten -1)
        int maxX = values[0].length - 1; 
        // Höhe des Arrays (Anzahl der Zeilen)
        int maxY = values.length - 1;   

        // Neues Array das die gedrehte Version speichert
        // Die Dimensionen sind vertauscht - beim Rotieren werden die Zeilen zu Spalten und umgekehrt
        final int[][] rotatedArray = new int[maxX + 1][maxY + 1];

        // Schleife über jede Zeile (y) des ursprünglichen Arrays
        for (int y = 0; y <= maxY; y++) {
            // Schleife über jede Spalte (x) der aktuellen Zeile
            for (int x = 0; x <= maxX; x++) {
                // Ursprünglicher Wert an Position [y][x]
                int origValue = values[y][x];

                if (rotateLeft) {
                    // Spaltenwert (x) wird zur neuen Zeile
                    // und Zeilenwert (y) wird von rechts nach links verschoben
                    rotatedArray[maxX - x][y] = origValue;
                } else {
                    // Zeilenwert (y) wird zur neuen Spalte
                    // und Spaltenwert (x) wird von oben nach unten verschoben
                    rotatedArray[x][maxY - y] = origValue;
                }
            }
        }
        return rotatedArray;
    }
    public static void print(int values[][]) {
        for (int i = 0; i < values.length; i++) {
            System.out.println(Arrays.toString(values[i]));
        }
    }
}


//Aufgabe: Schreibe ein Programm, das ein 2D-Array dreht (90° nach links oder rechts).
