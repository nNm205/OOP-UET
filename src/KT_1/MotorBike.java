package KT_1;

public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    /**
     * Motorbike():
     * khoi tao ko tham so.
     */

    public MotorBike(String brand, String model,
                     String registrationNumber, Person owner,
                     boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    /**
     * getInfo():
     * get info.
     */

    @Override
    public String getInfo() {
        StringBuilder result = new StringBuilder("Motorbike:\n");
        result.append("  Brand: " + getBrand() + "\n");
        result.append("  Model: " + getModel() + "\n");
        result.append("  Registration Number: " + getRegistrationNumber() + "\n");
        result.append("  Has Sidecar: " + hasSidecar + "\n");
        result.append("  Belongs to: " + getOwner()
                + " - " + getOwner().getAddress() + "\n");
        return result.toString();
    }

    /**
     * getHasSidecar():
     * get hassidecar.
     */

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    /**
     * setHasSidecar():
     * set hasSidecar.
     */

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
