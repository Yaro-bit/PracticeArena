//Gesamtbewertung: 8.5/10
//Das Programm funktioniert korrekt und ist gut lesbar. Kleinere Verbesserungen in der String-Verarbeitung und Struktur wären hilfreich.
//

package basics;

public class SimpleWorkWithStrings {

	public static void main(String[] args) {
		String str = """
				Yo, das ist mein mehrzeiliger String,
				hier handelt es sich, um einen String der
				mehrere Zeilenumbrüche hat. Zeilen umbruch folgt...
				Hier ist auch ein Tabulator \t\t\t/t
				""";
		System.out.println("Das ist mein string:\n" + "\n" + str + "\nDieser hat folgende länge von: \t\t\t"
				+ str.length() + "\nAn der postition 13 ist folgendes zeichen: \t" + str.charAt(13));
		String search = "mein";
		if (str.contains(search)) {
			System.out.println("Das gesuchte Wort:\t\t\t\t" + search + "\nexistiert und befindet sich an dieser position:\t"
					+ str.indexOf(search));
		} else
			System.out.println("Das wort existiert in gegebenen Text nicht");
	}

}

//1. Erstelle ein Programm, das einen mehrzeiligen String verarbeitet:
//    Gib den String aus, seine Länge und das Zeichen an Position 13.
//    Suche nach einem Wort im String und gib die Position aus, falls es gefunden wird.