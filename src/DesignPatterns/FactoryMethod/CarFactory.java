package DesignPatterns.FactoryMethod;

public class CarFactory extends VehicleFactory {
    @Override
    public Vehicle startVehicle() {
        return new Car();
    }
}
