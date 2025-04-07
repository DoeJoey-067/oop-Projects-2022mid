package model;

public class LevelSensor implements SmartSensor {
    private int fillLevel;

    public LevelSensor(int fillLevel) {
        this.fillLevel = fillLevel;
    }

    @Override
    public boolean isTriggered() {
        return fillLevel >= 90;
    }

    @Override
    public String getSensorType() {
        return "Level";
    }

    public int getFillLevel() {
        return fillLevel;
    }
}
