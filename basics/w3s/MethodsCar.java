package w3s;

public class MethodsCar {
	
	public void fullThrottle(){
		System.out.println("The car is going as fast as it can!");
	}
	public void speed(int maxSpeed){
		System.out.println("Max speed is: " + maxSpeed);
	}
	
	public static void main(String[] args) { // Inside main, call the methods on the myCar object
		MethodsCar car = new MethodsCar();
		car.fullThrottle();
		car.speed(220);
	}
}
