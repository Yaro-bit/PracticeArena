//Bewertung: 8/10 Punkten
// -1: Die Methode behandelt nur Großbuchstaben und erfordert, dass der Eingabetext zuvor in Großbuchstaben umgewandelt wird. 
//Kleinbuchstaben werden nicht berücksichtigt.
// -1: Die Methode könnte optimiert werden, indem eine Bedingung wie Character.toLowerCase(asCharArray[i]) 
//verwendet wird, um sowohl Groß- als auch Kleinbuchstaben abzudecken.

package basics;

import java.util.Scanner;

public class GuessingVowels {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter your input: \t");
		String inputUpperCase = scan.nextLine().toUpperCase();
		String wordWithoutVowels = removeVowels(inputUpperCase);
		System.out.print(wordWithoutVowels);
	}

	private static String removeVowels(String input) {

		char asCharArray[] = input.toCharArray();
		for (int i = 0; i < asCharArray.length; i++) {
			if (asCharArray[i] == 'A' || asCharArray[i] == 'E' || asCharArray[i] == 'I' || asCharArray[i] == 'O'
					|| asCharArray[i] == 'U' || asCharArray[i] == 'Ä' || asCharArray[i] == 'Ö'
					|| asCharArray[i] == 'Ü') {
				asCharArray[i] = '_';
			}

		}
		return String.valueOf(asCharArray);
	}
}

//4 Aufgabe: Vokale durch Unterstriche ersetzen
//Schreibe ein Programm, das vom Benutzer eine Eingabe abfragt, alle Vokale (inklusive Ä, Ö, Ü) durch Unterstriche (_) ersetzt und das Ergebnis ausgibt.