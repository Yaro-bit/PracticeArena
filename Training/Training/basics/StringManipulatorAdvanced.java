//Bewertung: 6.5/10 Punkten
//
//    -1.5: Die Methode charCounter hat fehlerhafte Logik. Sie versucht für jedes Zeichen den gesamten String zu parsen, was ineffizient und unlogisch ist. Zudem wird das Ergebnis des Zählens nicht korrekt genutzt.
//    -1: scanner.next() liest nur das erste Wort. Für ganze Zeilen sollte scanner.nextLine() verwendet werden.
//    -0.5: Die Fehlermeldung NumberFormatException ist nicht nutzerfreundlich und sollte durch eine klarere Beschreibung ersetzt werden.
//    -0.5: Kein Test, ob der String ein Wort ist (enthält nur Buchstaben), wie in der Aufgabe verlangt.



package basics;

import java.util.Scanner;

public class StringManipulatorAdvanced {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your String");
		String userinput = scanner.next();
		int count = charCounter(userinput);
		
		try {
			int number = Integer.parseInt(userinput);
			if (number >= 0) {
				System.out.println(number * 5);
			} else if (number < 0) {
				System.out.println("Number ist under 0");
			}
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException");
		}
		

	}

	private static int charCounter(String userinput) {
		int count = 0;
		for (int i = 0; i < userinput.length(); i++) {
			userinput.charAt(i);
			try {
				int number = Integer.parseInt(userinput);
			} catch (NumberFormatException e) {
				count++;
			}
		}
		return count;

	}
}

//Alternative Aufgabe: String-Validierung und einfache Berechnung
//
//Aufgabe:wwwwwww
//Schreibe ein Programm, das eine Benutzereingabe entgegennimmt und prüft:
//
//    Ob der String eine positive ganze Zahl darstellt.
//        Falls ja, multipliziere die Zahl mit 5 und gib das Ergebnis aus.
//    Ob der String ein Wort ist (enthält nur Buchstaben).
//        Falls ja, gib die Länge des Wortes aus.
//    Falls der String weder eine Zahl noch ein Wort ist, gib eine Fehlermeldung aus.
//
//Themen:
//
//    Strings
//    Typprüfung
//    Datentypen
//    Bedingte Anweisungen
