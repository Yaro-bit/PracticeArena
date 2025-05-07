package w3s;

public class Polymorphism_Main {
	public static void main(String[] args) {
		Polymorphism_Animal myAnimal = new Polymorphism_Animal();
		Polymorphism_Pig myPig = new Polymorphism_Pig();
		Polymorphism_Hund myDog = new Polymorphism_Hund();
		
		myAnimal.AnimalSound();
		myPig.animalSound();
		myDog.animalSound();
		
	}
}
