package Model;

public class Dog extends Animal {
	int id;
	String name;
	
	public Dog(int id, String name) {
		super(id, name);
	}

	public void makeSound() {
		System.out.println("Wow ! Wow!");
	}
}
