package step1;

import java.util.Scanner;

public class temperatureCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Gib die Temperatur in Grad Celsius ein: ");
		double celsius = scan.nextDouble();
		double fahrenheit = Calculator(celsius);
		System.out.print("Die Temperatur in Fahrenheit beträgt: "+fahrenheit);
		scan.close();
	}

	private static double Calculator(double celsius) {
		double fahrenheit = (celsius * 9/5) + 32;
		return fahrenheit;
	}
	
}
