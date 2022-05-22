package com.github.nutscoding.dmdev.homework.week3.space;

public class Star extends SpaceObject {

    private double temperature;
    private double radius;

    public Star(String name, double weight, double distanceToEarth, double radius, double temperature) {
        super(name, weight, distanceToEarth);
        this.radius = radius;
        this.temperature = temperature;
    }

    @Override
    public void specialFeature() {
        System.out.println("Generates energy");
    }

    public double findDiameter(SpaceObject spaceObject) {
        return radius * 2;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Star{" +
                "temperature=" + temperature +
                ", radius=" + radius +
                '}';
    }
}
