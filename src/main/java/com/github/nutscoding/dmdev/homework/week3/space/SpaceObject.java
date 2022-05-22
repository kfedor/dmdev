package com.github.nutscoding.dmdev.homework.week3.space;

public abstract class SpaceObject {

    private String name;
    private double weight;
    private double distanceToEarth;

    public SpaceObject(String name, double weight, double distanceToEarth) {
        this.name = name;
        this.weight = weight;
        this.distanceToEarth = distanceToEarth;
    }

    public void compareWeight(SpaceObject spaceObject1, SpaceObject spaceObject2) {
        if (spaceObject1.getWeight() > spaceObject2.getWeight()) {
            System.out.println(spaceObject1.getName() + " has bigger weight than " + spaceObject2.getName());
        } else if (spaceObject1.getWeight() < spaceObject2.getWeight()) {
            System.out.println(spaceObject1.getName() + " has smaller weight than " + spaceObject2.getName());
        } else {
            System.out.println("Wight of " + spaceObject1.getName() + " and " + spaceObject2.getName() + " are equal.");
        }
    }

    public abstract void specialFeature();

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getDistanceToEarth() {
        return distanceToEarth;
    }
}
