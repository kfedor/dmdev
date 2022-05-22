package com.github.nutscoding.dmdev.homework.week3.space;

public final class SpaceUtils {

    public static final double G = 6.67 * Math.pow(10, -11);

    private SpaceUtils() {
    }

    public static void findGravityForce(SpaceObject spaceObject1, SpaceObject spaceObject2) {
        double distance = spaceObject1.getDistanceToEarth() - spaceObject2.getDistanceToEarth();
        double gravityForce = G * (spaceObject1.getWeight() * spaceObject2.getWeight() /
                (Math.pow(distance, 2)));
        System.out.println("Gravity force between " +
                spaceObject1.getName() +
                " and " + spaceObject2.getName() +
                " is " + gravityForce);
    }

    public static boolean isStar(SpaceObject spaceObject) {
        return spaceObject instanceof Star;
    }

}
