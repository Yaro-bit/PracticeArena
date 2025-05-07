package w3s;

import java.util.HashSet;

public class HashSets {

	public static void main(String[] args) {
		HashSet<String> cars = new HashSet<String>();

		cars.add("T45");
		cars.add("Panther");
		cars.add("Puma");
		cars.add("Panzer III");
		cars.add("BTR");
		cars.add("Puma");
		
		System.out.println(cars.contains("Mazda"));
		System.out.println(cars.contains("Puma."));
		System.out.println(cars.contains("Puma"));

		cars.remove("T45");
		cars.remove("BTR");

		// cars.clean as usual

		System.out.println(cars);
		System.out.println("Insgesamt " + cars.size() + " Panzer");

		System.out.println();
		for (String i : cars) {
			System.out.println(i);
		}

		// wich numbers are in set

		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.add(1);
		numbers.add(5);
		numbers.add(8);

		for (int i = 1; i <= 10; i++) {
			if (numbers.contains(i)) {
				System.out.println(i + " was found in the set.");
				break;
			} else {
				System.out.println(i + " was not found in the set.");
				break;
			}

		}

	}
}
