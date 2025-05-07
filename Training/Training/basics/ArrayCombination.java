 //Die Verwendung von try-catch ist unnötig und macht den Code weniger effizient und leserlich.

package basics;

import java.util.Arrays;

public class ArrayCombination {

	public static void main(String[] args) {
		int array1[] = { 1, 2, 3 };
		int array2[] = { 11, 22, 33, 44 };
		System.out.println(Arrays.toString(array1) + " " + Arrays.toString(array2));

		System.out.println();
		int arraySum[] = concat(array1, array2);
		System.out.println(Arrays.toString(arraySum));

	}

	private static int[] concat(int[] array1, int[] array2) {

		int arraySum[] = new int[array1.length + array2.length];
		int j = 0;

		for (int i = 0; i < arraySum.length; i++) {
			try {
				arraySum[i] = array1[i];
			} catch (Exception e) {

				arraySum[i] = array2[j];
				j++;
			}
		}

		return arraySum;
	}
}

//2. Kombiniere zwei Arrays (array1 und array2) zu einem neuen Array, das alle Elemente der beiden Arrays enthält.