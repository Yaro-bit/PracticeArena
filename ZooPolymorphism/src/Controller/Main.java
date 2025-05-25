package Controller;

import Model.Animal;
import Model.Cat;
import Model.Cow;
import Model.Dog;

public class Main {
	public static void main(String[] args) {
		Animal[] animals = {
			new Cat(0, "Sheldon"),
			new Dog(1, "Lennat"),
			new Cow(2, "Stevard"),
			new Cat(3, "Ram"),
			new Dog(4, "Shyam"),
			new Cow(5, "Daisy")
		};

		for (int i = 0; i < animals.length; i++) {
			System.out.print(animals[i]+"  \t");
			animals[i].makeSound();
			System.out.println();
		}
	}
}
