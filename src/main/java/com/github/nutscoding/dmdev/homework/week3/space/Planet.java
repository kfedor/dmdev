package com.github.nutscoding.dmdev.homework.week3.space;

public class Planet extends SpaceObject {

    private double radius;
    private boolean isSuitableForLiFe;

    public Planet(String name, double weight, double distanceToEarth, double radius, boolean isSuitableForLiFe) {
        super(name, weight, distanceToEarth);
        this.radius = radius;
        this.isSuitableForLiFe = isSuitableForLiFe;
    }

    @Override
    public void specialFeature() {
        System.out.println("Potentially could have inhabitants");
    }

    public double findDiameter(SpaceObject spaceObject) {
        return radius * 2;
    }

    public double getRadius() {
        return radius;
    }

    public boolean isSuitableForLiFe() {
        return isSuitableForLiFe;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "radius=" + radius +
                ", isSuitableForLiFe=" + isSuitableForLiFe +
                '}';
    }
}
