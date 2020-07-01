package org.example.solarsystem.solarsystemdata.service;

import org.example.solarsystem.solarsystemdata.entity.AbstractPlanet;

public interface Planet<T extends AbstractPlanet<T>> {
    double accelerationCalculate(double weight, double radius);
}
