//Bewertung: 0/10 Punkten - FAILED

package basics;
public class StringMerger {

	public static void main(String[] args) {
		String inputString1="fette";
		String inputString2="DUTTELN";

		String merged = merger(inputString1,inputString2);
		System.out.println(merged);
		
	}

	private static String merger(String inputString1, String inputString2) {
		int length1 = inputString1.length();
		int length2 = inputString2.length();
		int maxlength = Math.max(length1, length2);
		
		String result ="";
		
		for (int i = 0; i<maxlength;i++) {
			if (i < length1) {
				result= result + inputString1.charAt(i);
			}
			if (i < length2) {
				result= result + inputString2.substring(i+1);
			}			
			
		}
		return result;
	}

}
//5 Aufgabe: String-Merger
//Schreibe ein Programm, das zwei Strings Zeichen für Zeichen abwechselnd kombiniert. Falls einer der Strings kürzer ist, sollen die restlichen Zeichen des längeren angehängt werden.
