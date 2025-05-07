package euler;

public class P1 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("Die Summe der Zahlen unter 1000, die durch 3 oder 5 teilbar sind, ist: " + sum);
	}
}
