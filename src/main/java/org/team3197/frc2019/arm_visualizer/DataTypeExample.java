package org.team3197.frc2019.arm_visualizer;

import edu.wpi.first.shuffleboard.api.data.ComplexData;

import java.util.Map;
import java.util.HashMap;

public class DataTypeExample extends ComplexData<DataTypeExample> {
    private final double x;
    private final double y;

    public DataTypeExample(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Map<String, Object> asMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("x", this.x);
        map.put("y", this.y);
        return map;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public DataTypeExample withX(double newX) {
        return new DataTypeExample(newX, this.y);
    }

    public DataTypeExample withY(double newY) {
        return new DataTypeExample(this.x, newY);
    }
}