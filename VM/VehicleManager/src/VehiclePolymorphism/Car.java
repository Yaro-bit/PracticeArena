package VehiclePolymorphism;

public class Car extends Vehicle {
    int numberOfDoors;

    public void showInfo() {
        System.out.println("Car: " + name + " | Speed: " + speed + " km/h | Doors: " + numberOfDoors);
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for speed
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Setter for numberOfDoors
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public static void main(String[] args) {
        // Create a new Car instance
        Car myCar = new Car();
        
        // Set values
        myCar.setName("BMW");
        myCar.setSpeed(120);
        myCar.setNumberOfDoors(4);
        
        // Show car info
        myCar.showInfo();
    }
}
