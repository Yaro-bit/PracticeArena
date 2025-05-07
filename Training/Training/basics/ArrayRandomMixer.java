//    -1 Unnötige Bedingung if (array[rand] != array[i]).
//    -1 Überflüssiges - 1 in Math.random() * array.length.
//    -1 Code könnte klarer strukturiert sein.

package basics;


import java.util.Arrays;

public class ArrayRandomMixer {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		System.out.println(Arrays.toString(array));
		randomiser(array);
		System.out.println(Arrays.toString(array));
	}

	private static void randomiser(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int rand = (int) (Math.random() * array.length);
			int save = array[rand];
			if (array[rand] != array[i]) {
				array[rand] = array[i];
				array[i] = save;
			}
		}
	}
}

//1. Erstelle ein Programm, das die Elemente eines bestehenden Arrays zufällig neu anordnet (durchmischt).