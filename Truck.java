package model;

public class Truck {
    private String truckId;
    private Driver driver;

    public Truck(String truckId, Driver driver) {
        this.truckId = truckId;
        this.driver = driver;
    }

    public String getTruckId() {
        return truckId;
    }

    public Driver getDriver() {
        return driver;
    }
}
