package Inheritance.P04_NeedForSpeed;

public class RaceMotorcycle extends Motorcycle {
    public RaceMotorcycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(8);
    }
}
