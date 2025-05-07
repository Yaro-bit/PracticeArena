package basics;

public class OOPMethods {

	public static void main(String[] args) {
		Cars cars = new Cars();
		System.out.println(cars);
		
		System.out.println("\n***Create new VW***");
		Cars myThirdCar = new Cars("VW", "Orange", 135);
		System.out.println("New Car: "+myThirdCar);
		System.out.println("***new Paint-job***");
		myThirdCar.paintWith("Green");
		System.out.println("Painted Car: "+myThirdCar);
		System.out.println("***apply Tuningkit***");
		myThirdCar.applyTuningkit();
		System.out.println("Tuned & Painted Car: "+myThirdCar);
		System.out.println("***apply second Tuningkit***");
		myThirdCar.applyTuningkit();
		
		
	}

}
class Cars{
	String brand;
	String color;
	int horsePower;
	boolean isTuned;
	
	public Cars() {
		this ("Unbekannt","Unlackiert",-1);
	}
	
	Cars (String brand, String color, int horsePower){
		this.brand = brand;
		this.color = color;
		this.horsePower = horsePower;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", horsePower=" + horsePower + "]";
	}
	public void paintWith (String newColor) {
		this.color = newColor;
	}
	public void applyTuningkit () {
		if(isTuned != true) {
		this.horsePower = horsePower+100;
		this.isTuned = true;
		} else {
			System.out.println("Already tuned");
		}
	}
}