package org.example.solarsystem.solarsystemdata.service.impl;

import org.example.solarsystem.solarsystemdata.entity.AbstractPlanet;
import org.example.solarsystem.solarsystemdata.entity.Jupiter;
import org.example.solarsystem.solarsystemdata.service.Planet;

public class JupiterPlanetImpl extends Jupiter implements Planet<Jupiter> {
    @Override
    public double accelerationCalculate(double weight, double radius) {
        return AbstractPlanet.gravitationalConstant * weight/ (radius * radius);
    }
}
