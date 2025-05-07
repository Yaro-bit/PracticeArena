package basics;


import java.util.Arrays;

public class ArrayWorkWithArray {

	public static void main(String[] args) {
		int numbers[] = {1,2,3,4,5,6,7,8,9,0};
		System.out.println(Arrays.toString(numbers));
		
		reverse(numbers,0,numbers.length-1);
		System.out.println(Arrays.toString(numbers));
		
		int x = 10;
		int y = 9;
		System.out.println("");
		System.out.println("finde:"+x+" ergebniss;"+ find(numbers, x));
		System.out.println("finde:"+y+" ergebniss;"+ find(numbers, y));

	}

	public static void swap(final int values[],final int first, final int second) {
		final int v1 = values[first];
		final int v2 = values[second];
		
		values[first] = v2;
		values[second]= v1;
	}
	public static void reverse(final int[] values, int start, int end) {
		while (start<end) {
			swap(values,start, end);
			start++;
			end--;
		}
	}
	public static int find(final int[] values, final int search) {
		for (int i = 0; i<values.length; i++) {
			if(values[i]== search) {
				return i;
			}
		}
		return -1;
	}
}

//Aufgabe: Implementiere ein Programm, das ein Array umkehrt und nach Elementen sucht.

