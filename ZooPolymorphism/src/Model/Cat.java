package Model;

public class Cat extends Animal {
	int id;
	String name;
	
	public Cat(int id, String name) {
		super(id, name);
	}

	public void makeSound() {
		System.out.println("Miau! Miau!");
	}
}
