//Bewertung: 9/10 Punkten
//    -1: Die Methode KShapePattern enthält redundante Schleifenlogik, die durch eine optimierte Implementierung kombiniert oder verkürzt werden könnte.

package basics;
public class KForm {

	public static void main(String[] args) {
		String str = "ABCDEF";
		KShapePattern(str);
	}

	public static void KShapePattern(String str) {
		for (int i = str.length(); i > 0; i--) {
			System.out.print(str.substring(0, i)+"\n");
		}
		for (int j = 1; j < str.length()+1; j++) {
			System.out.print(str.substring(0, j)+"\n");
		}
	}
}
//9. Schreibe ein Programm, das eine Zeichenkette in Form eines "K" Musters ausgibt.
//Beispiel: Für die Eingabe ABCDEF soll das Programm folgende Ausgabe erzeugen: