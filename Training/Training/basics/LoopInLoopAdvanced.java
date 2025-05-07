//Bewertung: 9/10 Punkten
//    -1: Die Verwendung von zwei nahezu identischen Methoden (printOutChar1 und printOutChar2) führt zu Redundanz. 
//    Es wäre besser, die Logik zu vereinheitlichen und Parameter für unterschiedliche Druckmuster zu verwenden.

package basics;
public class LoopInLoopAdvanced {

	public static void main(String[] args) {
		char c[] = { 'A', 'B', 'C', 'D', 'E', 'F' };
		printOutChar1(c);
		printOutChar2(c);

	}

	private static void printOutChar1(char c[]) {

		int num = 0;
		for (int i = c.length; i != 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(c[num] + " ");
			}
			num = num + 1;
			System.out.println("");
		}

	}
	private static void printOutChar2(char c[]) {

		int num = 0;
		for (int i = 0 ; i != c.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(c[num] + " ");
			}
			num = num+1;
			System.out.println("");
		}
		//Bewertung: 9/10 Punkten
		//
		//-1: Die Verwendung von zwei nahezu identischen Methoden (printOutChar1 und printOutChar2) führt zu Redundanz. Es wäre besser, die Logik zu vereinheitlichen und Parameter für unterschiedliche Druckmuster zu verwenden.
		//
		//Aufgabe:
		//Schreibe ein Programm, das zwei verschiedene dreiecksförmige Ausgaben von Zeichen erzeugt:
		//
		//Ein absteigendes Dreieck, bei dem die Anzahl der Zeichen in jeder Zeile abnimmt.
		//Ein aufsteigendes Dreieck, bei dem die Anzahl der Zeichen in jeder Zeile zunimmt.
	}
}
//Bewertung: 9/10 Punkten
//
//-1: Die Verwendung von zwei nahezu identischen Methoden (printOutChar1 und printOutChar2) führt zu Redundanz. Es wäre besser, die Logik zu vereinheitlichen und Parameter für unterschiedliche Druckmuster zu verwenden.
//
//Aufgabe:
//Schreibe ein Programm, das zwei verschiedene dreiecksförmige Ausgaben von Zeichen erzeugt:
//
//Ein absteigendes Dreieck, bei dem die Anzahl der Zeichen in jeder Zeile abnimmt.
//Ein aufsteigendes Dreieck, bei dem die Anzahl der Zeichen in jeder Zeile zunimmt.

