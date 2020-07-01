package org.example.solarsystem.solarsystemdata.service.impl;

import org.example.solarsystem.solarsystemdata.entity.AbstractPlanet;
import org.example.solarsystem.solarsystemdata.entity.Mercury;
import org.example.solarsystem.solarsystemdata.service.Planet;

public class MercuryPlanetImpl extends Mercury implements Planet<Mercury> {
    @Override
    public double accelerationCalculate(double weight, double radius) {
        return AbstractPlanet.gravitationalConstant * weight/ (radius * radius);
    }
}
