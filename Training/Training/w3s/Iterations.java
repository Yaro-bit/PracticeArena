package w3s;

import java.util.*;

public class Iterations {
	public static void main(String[] args) {
		ArrayList<String> ships = new ArrayList<String>();
		ships.add("Bismark");
		ships.add("Constitution");
		ships.add("Vicktory");
		ships.add("Enterprise");
		ships.add("Titanic");

		Iterator<String> it = ships.iterator();
		System.out.println(it.next()); // only first

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		ArrayList<Integer> num = new ArrayList<Integer>(); // only test
		num.add(12);
		num.add(8);
		num.add(2);
		num.add(23);

		Iterator<Integer> it2 = num.iterator();

		while (it2.hasNext()) {
			Integer i = it2.next();
			if (i < 10) {
				it2.remove();
			}

		}
		System.out.println(num);

	}
}
