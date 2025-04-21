package DesignPatterns.FactoryMethod;

public class Truck implements Vehicle {
    public void start() {
        System.out.println("Truck is started");
    }8

    public void move() {
        System.out.println("Truck is moving");
    }
}
