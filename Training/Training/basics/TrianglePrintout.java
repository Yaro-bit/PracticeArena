//Bewertung: 10/10 Punkten
//Der Code ist korrekt und effizient. Die Ausgabelogik für das Dreieck ist gut umgesetzt und erfüllt die Aufgabe wie erwartet.

package basics;
public class TrianglePrintout {

	public static void main(String[] args) {
		int maxRow = 4;
		printOut(maxRow);
	}

	private static void printOut(int maxRow) {
		int num = 1;
		for (int i = 1; i<= maxRow;i++) {

			for(int j =1; j<= i;j++) {
				System.out.print(num+" ");
				num++;
			}
		System.out.println("");
		}
	}
}


//7. Schreibe ein Programm, das eine Zahl dreiecksförmig ausgibt, wobei jede Zeile fortlaufend Zahlen enthält. 
//Die Anzahl der Zahlen pro Zeile entspricht der Zeilennummer.