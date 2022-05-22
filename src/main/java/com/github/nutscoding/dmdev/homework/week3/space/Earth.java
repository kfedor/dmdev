package com.github.nutscoding.dmdev.homework.week3.space;

public class Earth extends Planet implements Visitable {


    public Earth(String name, double weight, double distanceToEarth, double radius, boolean isSuitableForLiFe) {
        super(name, weight, distanceToEarth, radius, isSuitableForLiFe);
    }

    public void rotate() {
        System.out.println("Earth rotates around the sun and its axis.");
    }

    @Override
    public void visit() {
        System.out.println("You can visit Earth.");
    }


    @Override
    public String toString() {
        return "Earth{" +
                "name=" + this.getName() +
                ", weight=" + this.getWeight() +
                ", distanceToEarth=" + this.getDistanceToEarth() +
                ", radius=" + this.getRadius() +
                ", isSuitableForLife=" + this.isSuitableForLiFe() +
                "}";
    }
}
