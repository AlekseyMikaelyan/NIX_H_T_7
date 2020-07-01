package org.example.solarsystem.solarsystemdata.entity;

public class AbstractPlanet <T>{
    private double weight;
    private double radius;
    public static final double gravitationalConstant = 6.6720 * Math.pow(10.0, -11.0);

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
