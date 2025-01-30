package Bibliothekssystem3;

public class StringManipulator {

	static String toUpperCaseTitle(String title) {
		String titleUpperCase = title.toUpperCase(); // Satz in einzelne Wörter aufteilen
		return titleUpperCase;
	}
	static String toUpperCaseName(String name) {
		
		char nameAsCharArray[] = name.toCharArray();
		for (int i = 0; i < nameAsCharArray.length; i++)
			if (nameAsCharArray[i] == ' ') {
				nameAsCharArray[i + 1] = Character.toUpperCase(nameAsCharArray[i + 1]);
				if (Character.isLetter(nameAsCharArray[0])) {
					nameAsCharArray[0] = Character.toUpperCase(nameAsCharArray[0]);
				}
			}
		return String.valueOf(nameAsCharArray);
	}
}
//4. String-Manipulation
//Implementiere folgende Methoden:
//    Konvertiere die Titel aller Bücher in Großbuchstaben und gib sie aus.
//    Formatiere die Namen der Mitglieder so, dass nur der erste Buchstabe groß ist (z. B. "anna" → "Anna").