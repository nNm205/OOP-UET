package DesignPatterns.FactoryMethod;

public class TruckFactory extends VehicleFactory {
    @Override
    public Vehicle startVehicle() {
        return new Truck();
    }
}
