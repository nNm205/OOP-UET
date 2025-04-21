package DesignPatterns.FactoryMethod;

public class FactoryMethodTest {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.startVehicle();
        car.move();

        VehicleFactory truckFactory = new TruckFactory();
        Vehicle truck = truckFactory.startVehicle();
        truck.move();
    }
}
