//Bewertung: 8/10 Punkten
//
//    +0.5: Der Regex zur Prüfung von Buchstaben und Zahlen ist korrekt und erfüllt die Aufgabe.
//    -1: Die Initialisierung von String pw = "0" ist unnötig und kann entfernt werden, da scanner.next() immer einen gültigen Wert zurückgibt.
//    +0.5: Die Längenprüfung pw.length() < 8 ist korrekt, jedoch ist eine Fehlermeldung für Passwörter mit weniger als 8 Zeichen gegeben. Das ist gut, aber du könntest auch klarstellen, dass 8 oder mehr Zeichen benötigt werden.
//    -0.5: Der Benutzer erhält keine Hinweise zu den Anforderungen für das Passwort vor der Eingabe.
//    
    
package basics;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StringManipulatiorAdvanced2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your pw: ");
		String pw = "0";
		pw = scanner.next();
		
		Pattern p = Pattern.compile("[a-zA-Z0-9]*");
		if (!p.matcher(pw).matches()) {
			System.out.println("Das Passwort darf nur Buchstaben und Zahlen enthalten.");
		} else if (pw.length() < 8) {
			System.out.println("Das Passwort muss mindestens 8 Zeichen lang sein.");
		} else {
			System.out.println("Das Passwort ist gültig.");
		}
		scanner.close(); //<- FUUUUUUU
	}
}
//Aufgabe:
//Schreibe ein Programm, das den Benutzer nach einem Passwort fragt und folgende Prüfungen durchführt:
//
//    Prüfen, ob das Passwort nur aus Buchstaben und Zahlen besteht.
//        Falls nicht, gib eine Fehlermeldung aus: "Das Passwort darf nur Buchstaben und Zahlen enthalten."
//
//    Prüfen, ob das Passwort mindestens 8 Zeichen lang ist.
//        Falls nicht, gib eine Fehlermeldung aus: "Das Passwort muss mindestens 8 Zeichen lang sein."
//
//    Falls das Passwort gültig ist, gib aus: "Das Passwort ist gültig."
//
//Themen:
//
//    Strings
//    Datentypen
//    Typprüfung
//    Bedingte Anweisungen