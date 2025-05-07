package VehiclePolymorphism;

public class Vehicle_Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        Motorcycle myMotorcycle = new Motorcycle();
        
        myCar.setName("BMW");
        myMotorcycle.setName("Yamaha");
        
        myCar.setSpeed(50);
        myMotorcycle.setSpeed(50);
        
        myCar.setNumberOfDoors(5);
        myMotorcycle.setHelmetRequired(true);
        
        myCar.accelerate(20);
        myMotorcycle.accelerate(30);
        
        myMotorcycle.showInfo();
        myCar.showInfo();
    }
}
