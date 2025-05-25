package model;


public class Bike extends Transport {
    public Bike(String brand) {
        super(brand);
    }

    @Override
    public void move() {
        System.out.println("Bike is pedaling...");
    }
}
