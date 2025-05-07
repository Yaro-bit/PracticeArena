//Bewertung: 9/10 Punkten
//    -1: Der Index i beginnt bei 1, was zu einer unnötigen Verzögerung bei der Ausgabe führt, 
//    da Arrays in Java bei Index 0 beginnen. Es wäre besser, die Schleifen mit i = 0 und j = 0 zu starten,
//    um die Konvention zu wahren und die Lesbarkeit zu verbessern.

package basics;
public class LoopInLoop {

	public static void main(String[] args) {
		char c[] = { 'A', 'B', 'C', 'D', 'E' };
		printOutChar(c);

	}

	private static void printOutChar(char c[]) {

		int num = 0;
		for (int i = 1; i <= c.length; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(c[num] + " ");
			}
			num = num + 1;
			System.out.println("");
		}
	}
}

//8. Schreibe ein Programm, das ein Array von Zeichen ausgibt, wobei in jeder Zeile die Anzahl der Zeichen schrittweise erhöht wird.
//Die erste Zeile enthält 1 Zeichen, die zweite 2 Zeichen, und so weiter.