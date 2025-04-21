package DesignPatterns.FactoryMethod;

public class Car implements Vehicle {
    public void start() {
        System.out.println("Car is started");
    }

    public void move() {
        System.out.println("Car is moving");
    }
}
