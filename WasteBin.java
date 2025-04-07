package model;

import java.util.List;

public class WasteBin {
    private String binId;
    private Location location;
    private List<SmartSensor> sensors;

    public WasteBin(String binId, Location location, List<SmartSensor> sensors) {
        this.binId = binId;
        this.location = location;
        this.sensors = sensors;
    }

    public boolean isFull() {
        for (SmartSensor sensor : sensors) {
            if (sensor.isTriggered()) {
                return true;
            }
        }
        return false;
    }

    public String getBinId() {
        return binId;
    }

    public Location getLocation() {
        return location;
    }

    public List<SmartSensor> getSensors() {
        return sensors;
    }
}
