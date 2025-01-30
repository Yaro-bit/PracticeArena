//Bewertung: 0/10 Punkten - FAILED
//    -1: Scanner wird in der Methode verwendet, aber er sollte nur im main-Block gehandhabt werden, um die Methode flexibler zu machen.
//    -1: String-Verkettung in einer Schleife kann zu ineffizientem Code führen (verwenden von StringBuilder wäre besser).


package step1;
import java.util.Scanner;


public class TitleCaseWithScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie einen Satz ein: ");
        String input = scanner.nextLine();
        System.out.println(toTitleCase(input));
        
        scanner.close();  // Scanner schließen
    }

    private static String toTitleCase(String input) {
        String[] words = input.split(" ");  // Satz in einzelne Wörter aufteilen
        StringBuilder result = new StringBuilder();
                for (String word : words) {
            if (word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0))) // ersten Buchstaben groß
                      .append(word.substring(1).toLowerCase())         // Rest des Wortes klein
                      .append(" ");                                     // Leerzeichen hinzufügen
            }
        }
        return result.toString().trim(); // Rückgabe des resultierenden Titelsatzes ohne führende Leerzeichen
    }
}

// 2 Aufgabe: Schreibe ein Programm, das einen Benutzer nach einem Satz fragt und diesen Satz in "Title Case" umwandelt.
//Das bedeutet, dass der erste Buchstabe jedes Wortes groß geschrieben wird, während die restlichen Buchstaben klein bleiben.
