package KT_1;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList = new ArrayList<>();

    /**
     * Person():
     * khoi tao co tham so.
     */

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * addVehicle():
     * add vehicle.
     */

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    /**
     * removeVehicle():
     * remove vehicle.
     */

    public void removeVehicle(String registrationNumber) {
        vehicleList.removeIf(vehicle ->
                vehicle.getRegistrationNumber().equals(registrationNumber));
    }

    /**
     * getVehicleInfo():
     * get vehicle info.
     */

    public String getVehiclesInfo() {
        StringBuilder result = new StringBuilder();
        if (vehicleList.isEmpty()) {
            result.append(getName() + " has no vehicle!\n");
        } else {
            result.append(getName() + " has:\n\n");
            for (Vehicle vehicle : vehicleList) {
                result.append(vehicle.getInfo());
            }
        }
        return result.toString();
    }

    /**
     * getName():
     * get name.
     */

    public String getName() {
        return name;
    }

    /**
     * setName():
     * set name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * getAddress():
     * get address.
     */

    public String getAddress() {
        return address;
    }

    /**
     * setAddress():
     * set address.
     */

    public void setAddress(String address) {
        this.address = address;
    }
}


