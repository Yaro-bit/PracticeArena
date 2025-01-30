//-1: Die Methode reverse2dStringArray gibt das umgekehrte Array nur aus, anstatt ein neues umgekehrtes
// 2D-Array zu erstellen und zurückzugeben, was die Wiederverwendbarkeit einschränkt.
package step1;
public class array2dTriangleReverser {

	public static void main(String[] args) {
		String array [][] = {{"ONE"},{"TWO","TWO"},{"THREE","THREE","THREE"}};
		print2dStringArray(array);
		System.out.println();
		reverse2dStringArray(array);
	}

	private static void reverse2dStringArray(String[][] array) {
		for(int i = array.length-1; i>=0; i--) {
			for(int j = 0; j<array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static void print2dStringArray(String[][] array) {
		for(int i = 0; i<array.length; i++) {
			for(int j = 0; j<array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
