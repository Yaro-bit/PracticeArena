//Bewertung: 7.5/10 Punkten
//
//    -1: BufferedReader ist unnötig, nur Scanner wird genutzt.
//    -0.5: Typprüfung ist unflexibel, akzeptiert keine gültigen Zahlen mit Leerzeichen oder Minuszeichen.
//    -1: Unfreundlich: Das Programm wirft eine Exception statt einer Fehlermeldung.
//
//Verbesserungsvorschlag: Nutze Integer.parseInt() mit try-catch für bessere Robustheit und Nutzerfreundlichkeit.



package step1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class stringManipulator {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);
		
		String useriInput;
		System.out.print("Enter your String: ");
		
		if (scanner.hasNextInt()) {
            int userInput = scanner.nextInt();
            System.out.println("It is a number + 10: " + (userInput+10));
            
        } else {
            throw new Exception("Entered value is not a number"); 
        }
		
	}

}
//3. String-Manipulation und Typprüfung
//
//Aufgabe:
//Schreibe ein Programm, das überprüft, ob ein gegebener String eine gültige Zahl ist.
//Falls ja, konvertiere den String in eine Zahl, addiere 10 dazu und gib das Ergebnis aus.
//Falls nicht, gib eine Fehlermeldung aus.
//
//Themen:
//
//    Strings
//    Datentypen
//    Typumwandlung
//    Bedingte Anweisungen
