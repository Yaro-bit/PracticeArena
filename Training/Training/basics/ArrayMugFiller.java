package basics;


public class ArrayMugFiller {

	public static void main(String[] args) {
		char[][] worldMap = { "#   ###".toCharArray(), "#   # #".toCharArray(), "#   ##".toCharArray(),
				"#####".toCharArray() };

		System.out.println("Vor der Füllung: \n");
		print(worldMap);
		floodFill(worldMap, 2, 2);
		System.out.println();
		System.out.println("Nach der Füllung: \n");
		print(worldMap);

	}

	static void floodFill(final char values[][], final int x, final int y) {
		if (x < 0 || y < 0 || y >= values.length || x >= values.length) {
			return;
		}

		if (values[y][x] == ' ') {
			values[y][x] = '~';
			floodFill(values, x, y - 1);
			floodFill(values, x + 1, y);
			floodFill(values, x, y + 1);
			floodFill(values, x - 1, y);
		}
	}

	static boolean isOnBoard(final char values[][], final int posX, final int posY) {
		return posX >= 0 && posY >= 0 && posX < values[0].length && posY < values.length;
	}

	public static void print(final char values[][]) {
		for (int y = 0; y < values.length; y++) {
			for (int x = 0; x < values[y].length; x++) {
				System.out.print(getAt(values, x, y) + " ");
			}
			System.out.println();
		}
	}

	static char getAt(final char values[][], final int x, final int y) {
		return values[y][x];
	}
}


//Schreibe ein Programm, das ein 2D-Array mit einem Flood-Fill-Algorithmus füllt.
//Beginne bei einer vorgegebenen Startposition (z.B. (2,2)) und ersetze benachbarte Leerzeichen ' ' mit ~, 
//bis keine angrenzenden Leerzeichen mehr vorhanden sind. Wände werden durch # dargestellt.
//Gib das Array vor und nach der Füllung aus.
//Ziel: Rekursive Füllung von benachbarten Leerzeichen im Array.
