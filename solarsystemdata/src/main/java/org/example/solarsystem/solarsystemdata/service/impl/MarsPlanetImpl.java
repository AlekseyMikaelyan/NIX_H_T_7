package org.example.solarsystem.solarsystemdata.service.impl;

import org.example.solarsystem.solarsystemdata.entity.AbstractPlanet;
import org.example.solarsystem.solarsystemdata.entity.Mars;
import org.example.solarsystem.solarsystemdata.service.Planet;

public class MarsPlanetImpl extends Mars implements Planet<Mars> {
    @Override
    public double accelerationCalculate(double weight, double radius) {
        return AbstractPlanet.gravitationalConstant * weight/ (radius * radius);
    }
}
