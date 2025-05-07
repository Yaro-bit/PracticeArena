//Bewertung: 9/10 Punkten
// -1: Die Methode verwendet StringBuilder, was gut ist, aber die Namensgebung der Methode könnte präziser sein (z.B. repeatChars statt StringRepeatChars).
// -1: Es fehlen Kommentare oder Erklärungen für die Funktionalität des Codes.

package basics;

public class RepeatCharts {

    public static void main(String[] args) {
        // init
        String str = "ABCDE";
        // process
        String outp = StringRepeatChars(str);
        // output
        System.out.println(outp);
    }

    static String StringRepeatChars(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= i; j++) {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}


//Aufgabe: Buchstaben wiederholen
//Schreibe eine Methode StringRepeatChars(String input), die die Buchstaben eines Worts gemäß ihrer Position wiederholt.
//Beispiel: ABC → A BB CCC.
//Tipps:
//    Iteriere durch den String mit einer Schleife.
//    Wiederhole jeden Buchstaben entsprechend seiner Position.
//    Verwende substring() oder charAt(), um auf die Zeichen zuzugreifen.
//    Setze das Ergebnis mit StringBuilder oder + zusammen.