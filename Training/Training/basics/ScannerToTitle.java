//Bewertung: 8/10 Punkten
// -1: Der Code könnte durch die Verwendung eines StringBuilder statt der direkten String-Verkettung 
// in der Schleife effizienter gestaltet werden.
// -1: Die Prüfung der ersten Zeichen könnte präziser sein (z.B. direkt beim ersten Zeichen, nicht nur bei Leerzeichen).

package basics;

import java.util.Scanner;

public class ScannerToTitle {

	public static void main(String[] args) {

		// Eingabe
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your string: ");
		String str = scan.nextLine();
		// Verarbeitung
		String newStr = toTitleCase(str);
		// Ausgabe
		System.out.print("\nYour new string: " + newStr);
	}

	private static String toTitleCase(String str) {
		char asCharArray[] = str.toCharArray();
		for (int i = 0; i < asCharArray.length; i++)
			if (asCharArray[i] == ' ') {
				asCharArray[i + 1] = Character.toUpperCase(asCharArray[i + 1]);
				if (Character.isLetter(asCharArray[0])) {
					asCharArray[0] = Character.toUpperCase(asCharArray[0]);
				}
			}

		return String.valueOf(asCharArray);
	}
}
//2 Aufgabe - retry - Title Case mit Scanner
//Schreibe ein Programm, das einen Satz vom Benutzer abfragt und ihn in Title Case umwandelt.