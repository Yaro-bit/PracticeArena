package model;

public class Car extends Transport {
    public Car(String brand) {
        super(brand);
    }

    @Override
    public void move() {
        System.out.println("Car is driving...");
    }
}
