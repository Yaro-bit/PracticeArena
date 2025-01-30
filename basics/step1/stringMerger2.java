package step1;

public class stringMerger2 {

	public static void main(String[] args) {
		String abc = "ABCDEFG";
		String num = "12345";
		String result = merger(abc,num);
		System.out.println(result);
	}

	private static String merger(String abc, String num) {
		
		int l1 = abc.length();
		int l2 = num.length();
		
		int max_length = Math.max(l1,l2);
		
		String result = "";
		
		for(int i=0; i<max_length;i++) {
			
			if(i<l1) {
				result = result + abc.charAt(i);
			}
			
			if(i<l2) {
				result = result + num.charAt(l2 - i - 1);
			}
		}
		
		return result;
	}

}
//Aufgabe: String-Reverse-Merger
//Schreibe ein Programm, das zwei Strings kombiniert, indem es die Zeichen des ersten Strings von vorne und die Zeichen -
//des zweiten Strings von hinten abwechselnd zusammenfügt. Falls einer der Strings kürzer ist, sollen die restlichen -
//Zeichen des längeren angehängt werden.
//Beispiel:
//Eingabe: ABCDEFG und 12345
//Ausgabe: A5B4C3D2E1FG