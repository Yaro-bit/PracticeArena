package w3s;

class Inheritance_Car extends Inheritance_Vehicle {
	private String model = "Mustang";
	
	
	public static void main(String[] args) {
		Inheritance_Car myCar = new Inheritance_Car();
		myCar.honk();
	
	
		System.out.print(" <- "+myCar.brand+" "+ myCar.model);	}
	
	
}