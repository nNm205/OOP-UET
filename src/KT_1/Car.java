package KT_1;

public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * Car():
     * khoi tao ko tham so.
     */

    public Car(String brand, String model,
               String registrationNumber, Person owner,
               int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * getInfo():
     * get info.
     */

    @Override
    public String getInfo() {
        StringBuilder result = new StringBuilder("Car:\n");
        result.append("  Brand: " + getBrand() + "\n");
        result.append("  Model: " + getModel() + "\n");
        result.append("  Registration Number: " + getRegistrationNumber() + "\n");
        result.append("  Number of Doors: " + getNumberOfDoors() + "\n");
        result.append("  Belongs to: " + getOwner()
                + "- " + getOwner().getAddress() + "\n");
        return result.toString();
    }

    /**
     * getNumberOfDoors():
     * get number of doors.
     */

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * setNumberOfDoors():
     * set numberOfDoors.
     */

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
