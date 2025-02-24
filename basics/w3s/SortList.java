package w3s;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class SortList {

	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");

		LinkedList<String> humans = new LinkedList<String>();
		humans.add("Hans");
		humans.add("Peter");
		humans.add("David");
		humans.add("Yaro");

		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		myNumbers.add(33);
		myNumbers.add(15);
		myNumbers.add(20);
		myNumbers.add(34);
		myNumbers.add(8);
		myNumbers.add(12);

		LinkedList<Integer> yourNumbers = new LinkedList<Integer>();
		yourNumbers.add(3);
		yourNumbers.add(5);
		yourNumbers.add(0);
		yourNumbers.add(4);
		yourNumbers.add(8);
		yourNumbers.add(2);

		Collections.sort(cars);
		Collections.sort(humans);
		Collections.sort(myNumbers);
		Collections.sort(yourNumbers);

		System.out.println(cars);
		System.out.println(humans);
		System.out.println(myNumbers);
		System.out.println(yourNumbers);

		System.out.println();
		System.out.println();

		Collections.sort(cars, Collections.reverseOrder()); // Sort cars
		Collections.sort(myNumbers, Collections.reverseOrder()); // Sort cars
		System.out.println(cars);
		System.out.println(myNumbers);

	}

}
