package basics;

public class Array2dOutput {

	public static void main(String[] args) {
		String array [][] = {{"ONE"},{"TWO","TWO"},{"THREE","THREE","THREE"}};
		print(array);
	}

	private static void print(String[][] array) {
		for(int i = 0; i<array.length; i++) {
			System.out.print("Line "+i+": ");
			for(int j = 0; j<array[i].length;j++) {
				System.out.print(array[i][j]+" ");
			}
		System.out.println();
		}
	}
	
}
//Schreibe eine Methode print2DArray(String[][] array), die ein 2D-Array zeilenweise ausgibt.
//Jede Zeile soll mit "Line X:" beginnen, wobei X die Zeilennummer ist.