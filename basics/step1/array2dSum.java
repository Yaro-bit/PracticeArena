package step1;

public class array2dSum {

	public static void main(String[] args) {

		int array[][] = { { 21, 43, 3}, { 1, 1, 1 }, { 2, 3, 4 } };

		print2dIntArray(array);
		sum2dIntArray(array);
		
	}

	public static void sum2dIntArray(int[][] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
			sum = sum+array[i][j];
			}
		}
		System.out.print ("Summe: "+ sum);
	}

	public static void print2dIntArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print("line " + (i + 1) + ": \t");
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}

//Schreibe eine Methode sum2DArray(int[][] array), 
//die die Summe aller Zahlen in einem 2D-Array berechnet und ausgibt.