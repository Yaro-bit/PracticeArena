package VehiclePolymorphism;

public class Motorcycle extends Vehicle {
    boolean helmetRequired;

    // Method to display the motorcycle's information
    public void showInfo() {
        System.out.println("Motorcycle: " + name + " | Speed: " + speed + " km/h | HelmetRequired: " + helmetRequired);
    }

    // Setter for speed
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Setter for helmetRequired
    public void setHelmetRequired(boolean helmetRequired) {
        this.helmetRequired = helmetRequired;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        // Create a new Motorcycle instance
        Motorcycle myMotorcycle = new Motorcycle();
        
        // Set values
        myMotorcycle.setName("Yamaha");
        myMotorcycle.setSpeed(80);
        myMotorcycle.setHelmetRequired(true);
        
        // Show motorcycle info
        myMotorcycle.showInfo();
    }
}
