package KT_1;

abstract class Vehicle {
    protected String brand;
    protected String model;
    protected String registrationNumber;
    protected Person owner;

    /**
     * Vehicle():
     * khoi tao co tham so.
     */

    public Vehicle(String brand, String model,
                   String registrationNumber, Person owner) {
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.owner = owner;
    }

    /**
     * getInfo():
     * get info.
     */

    abstract String getInfo();

    /**
     * transferOwnerShip():
     * change owner.
     */

    public void transferOwnership(Person newOwner) {
        this.owner = newOwner;
    }

    /**
     * getBrand():
     * get brand.
     */

    public String getBrand() {
        return brand;
    }

    /**
     * setBrand():
     * set brand.
     */

    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * getModel():
     * get model.
     */

    public String getModel() {
        return model;
    }

    /**
     * setModel():
     * set model.
     */

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * getRegistrationNumber():
     * get number.
     */

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * setRegistrationNumber():
     * set registrationNumber.
     */

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /**
     * getOwner():
     * get owner.
     */

    public Person getOwner() {
        return owner;
    }

    /**
     * setOwner():
     * set owner.
     */

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}

