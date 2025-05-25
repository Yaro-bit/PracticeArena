package model;

public abstract class Transport {
    protected String brand;

    public Transport(String brand) {
        this.brand = brand;
    }

    public void info() {
        System.out.println("Brand: " + brand);
    }

    public abstract void move();
}
