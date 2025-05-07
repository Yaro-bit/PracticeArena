package VehiclePolymorphism;

abstract class Vehicle {
    String name;
    int speed;

    public int accelerate(int value) {
        speed = speed + value;
        return speed;
    }

    public int brake(int value) {
        speed = speed - value;
        if (speed < 0) {
            speed = 0;
        }
        return speed;
    }

    public abstract void showInfo();

}
