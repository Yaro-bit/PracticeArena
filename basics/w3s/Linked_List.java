package w3s;
import java.util.LinkedList;
public class Linked_List {

	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
		
	    
	    cars.addFirst("Mazda");
	    cars.addLast("BEMEWE");
	    cars.removeLast();
	    
	    System.out.println(cars.getLast());
	    System.out.println(cars);
	
	}

}
