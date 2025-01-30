
//Bewertung: 8/10 Punkten
//
//    -0.5 Punkte: Fehlende Überprüfung auf leere Arrays, was zu einer Division durch Null führen könnte.
//    -0.5 Punkte: Kleinere Lesbarkeitsprobleme (z.B. der Klassenname sollte SimpleStatistics statt simpleStatistics sein).
//    -0.5 Punkte: Der max-Wert sollte mit Integer.MIN_VALUE initialisiert werden, um alle möglichen Werte korrekt zu berücksichtigen.


package step1;

public class simpleStatistics {

	public static void main(String[] args) {
		int numArray[] = {1,23,3,4,125,6,7,29,9,10};
		
		int sum = 0;
		double mean = 0;
		int max = 0;
		
		for(int i=0; i<numArray.length; i++) {
			  sum = sum + numArray[i];
			  mean = sum/(double)numArray.length;
			  if (numArray[i]>max) {
				  max=numArray[i];
			  }
		}
		 System.out.println(sum);
		 System.out.println(mean);
		 System.out.println(max);
	}

}


//2. Einfache Statistik aus einem Array
//
//Aufgabe:
//Erstelle ein Programm, das ein Array von 10 ganzen Zahlen enthält.
//Das Programm soll die Summe, den Durchschnitt und das Maximum der Zahlen berechnen und ausgeben.
//
//Themen:
//
//    Arrays
//    Schleifen
//    Variablen
//    Operatoren