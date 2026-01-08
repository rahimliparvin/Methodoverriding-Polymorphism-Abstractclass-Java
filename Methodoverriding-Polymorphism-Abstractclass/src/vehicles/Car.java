package vehicles;

public class Car  extends Vehicle {

    @Override
    public void move() {
        System.out.println("Car moves");
    }

    @Override
    public void startEngine() {
        System.out.println("Car starts engines");
    }
}
