package model;

public class WeightSensor implements SmartSensor {
    private double weight;

    public WeightSensor(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean isTriggered() {
        return weight >= 20.0;
    }

    @Override
    public String getSensorType() {
        return "Weight";
    }

    public double getWeight() {
        return weight;
    }
}
