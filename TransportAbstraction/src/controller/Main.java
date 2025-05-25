package controller; 
import model.Car;
import model.Bike;
import model.Transport;

public class Main {
    public static void main(String[] args) {
        Transport[] vehicles = {
                new Car("Toyota"),
                new Car("BMW"),
                new Bike("KTM")
            };
        
        for(int i = 0; i<vehicles.length;i++) {
        	vehicles[i].info();
        	vehicles[i].move();
        }
    }
}
