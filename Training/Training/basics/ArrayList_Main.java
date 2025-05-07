package basics;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Main {

	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars);

		cars.add(0, "Mazda");

		System.out.println(cars);

		String indexget = cars.get(0);
		System.out.println(indexget);

		cars.set(1, "Mazda");
		System.out.println(cars);

		cars.remove(1);
		System.out.println(cars);

		cars.clear();
		System.out.println(cars);// leer

		System.out.println(cars.size());

		cars.add("mazda");
		cars.add("bmw");
		cars.add("aston");
		cars.add("opel");

		for (int i = 0; i < cars.size(); i++) {
			System.out.print(cars.get(i) + " ");
		}

		System.out.println();

		for (String i : cars) {
			System.out.print(i + " "); // explicit call not needed
		}

		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		myNumbers.add(100);
		myNumbers.add(15);
		myNumbers.add(200);
		myNumbers.add(25);

		System.out.println();

		for (int i : myNumbers) {
			System.out.print(i+" ");
		}
		
		
		Collections.sort(cars);
		Collections.sort(myNumbers);
		
		System.out.println(cars);
		System.out.println(myNumbers);

		
		
	}

}
