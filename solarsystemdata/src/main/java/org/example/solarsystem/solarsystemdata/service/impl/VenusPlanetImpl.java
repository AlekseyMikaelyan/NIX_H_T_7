package org.example.solarsystem.solarsystemdata.service.impl;

import org.example.solarsystem.solarsystemdata.entity.AbstractPlanet;
import org.example.solarsystem.solarsystemdata.entity.Venus;
import org.example.solarsystem.solarsystemdata.service.Planet;

public class VenusPlanetImpl extends Venus implements Planet<Venus> {
    @Override
    public double accelerationCalculate(double weight, double radius) {
        return AbstractPlanet.gravitationalConstant * weight/ (radius * radius);
    }
}
