package step1;

public class arrayWorldmapInArray {

	public static void main(String[] args) {
		final char world[][] = {"################".toCharArray(),
								"##  P         ##".toCharArray(),
								"####  $  X  ####".toCharArray(),
								"###### $  ######".toCharArray(),
								"################".toCharArray() };
		print(world);
		
	}
	public static void print(final char values[][]) {
		for (int y = 0; y<values.length;y++) {
			for (int x = 0; x<values[y].length;x++) {
				System.out.print(getAt(values,x,y) + " ");
			}
		System.out.println();	
		}
	}
	static char getAt(final char values[][] , final int x, final int y) {
		return values [y][x];
	}
}
//Aufgabe: Erstelle eine Weltkarte in einem 2D-Array und gib sie aus.
