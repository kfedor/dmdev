package com.github.nutscoding.dmdev.homework.week3.space;

public class Sun extends Star {


    public Sun(String name, double weight, double distanceToEarth, double radius, double temperature) {
        super(name, weight, distanceToEarth, radius, temperature);
    }

    public void shine() {
        System.out.println("The sun is shining!");
    }

    @Override
    public String toString() {
        return "Sun{" +
                "name=" + this.getName() +
                ", weight=" + this.getWeight() +
                ", distanceToEarth=" + this.getDistanceToEarth() +
                ", radius=" + this.getRadius() +
                ", temperature=" + this.getTemperature() +
                "}";
    }
}

