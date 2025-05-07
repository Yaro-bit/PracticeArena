package w3s;

abstract class Abstract {
	public String fname = "Yaroslav";
	public int age = 29;

	public abstract void study(); // abstract method
}

class Student extends Abstract {
	public int gradYear = 2030;

	public void study() {
		System.out.println("Stuying");
	}
}

