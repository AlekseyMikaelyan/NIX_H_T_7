package org.example.solarsystem.solarsystemdata.entity;

public class Earth extends AbstractPlanet implements Planet {
    
    @Override
    public double accelerationCalculate(double weight, double radius) {
        return 0;
    }
}
