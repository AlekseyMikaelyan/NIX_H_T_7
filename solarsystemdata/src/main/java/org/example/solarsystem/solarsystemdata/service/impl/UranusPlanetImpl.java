package org.example.solarsystem.solarsystemdata.service.impl;

import org.example.solarsystem.solarsystemdata.entity.AbstractPlanet;
import org.example.solarsystem.solarsystemdata.entity.Uranus;
import org.example.solarsystem.solarsystemdata.service.Planet;

public class UranusPlanetImpl extends Uranus implements Planet<Uranus> {
    @Override
    public double accelerationCalculate(double weight, double radius) {
        return AbstractPlanet.gravitationalConstant * weight/ (radius * radius);
    }
}
