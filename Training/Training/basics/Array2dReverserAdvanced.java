package basics;

public class Array2dReverserAdvanced {

	public static void main(String[] args) {
		String array[][] = { { "ONE" }, { "TWO", "TWO" }, { "THREE", "THREE", "THREE" } };
		print2dStringArray(array);
		System.out.println();
		String arrayReverse[][] = upsideDowner2dStringArray(array);
		print2dStringArray(arrayReverse);
	}

	private static String[][] upsideDowner2dStringArray(String[][] array) {
		String arrayReversed[][] = new String[array.length][];
		int pos = 0;
		for (int i = array.length - 1; i >= 0; i--) {
			
			arrayReversed[pos] = array[i];
			pos++;
		}
		return arrayReversed;
	}


	private static void print2dStringArray(String[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}

//  Schreibe ein Programm, das ein 2D-Array zeilenweise ausgibt und eine Methode implementiert, 
 // die die Reihenfolge der Zeilen im Array umkehrt und das Ergebnis als neues 2D-Array zurückgibt.