package Model;

public class Cow extends Animal {
	int id;
	String name;
	
	public Cow(int id, String name) {
		super(id, name);
	}

	public void makeSound() {
		System.out.println("Moo! Moo!");
	}

	
	
}
