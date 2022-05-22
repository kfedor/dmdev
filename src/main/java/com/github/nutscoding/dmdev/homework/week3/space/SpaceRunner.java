package com.github.nutscoding.dmdev.homework.week3.space;

public class SpaceRunner {

    public static void main(String[] args) {
        Sun sun = new Sun("Sun", 15000, 80695, 7826, 74923);
        Earth earth = new Earth("Earth", 58416, 1, 47581, true);

        SpaceUtils.findGravityForce(sun, earth);
        System.out.println();
        System.out.println(SpaceUtils.isStar(earth));
        System.out.println();
        earth.compareWeight(earth, sun);
        System.out.println("Diameter of " + earth.getName() + " is " + earth.findDiameter(earth));
        System.out.println();
        System.out.println(earth);

        InternationalSpaceStation internationalSpaceStation =
                new InternationalSpaceStation("MKS",
                        1462,
                        4569,
                        new SpaceShip[]{
                                new SpaceShip(5, 1, 654),
                                new SpaceShip(6, 2, 899)
                        });
        int inhabitants = internationalSpaceStation.countInhabitants(internationalSpaceStation.getSpaceShips());
        System.out.println("There are " + inhabitants + " inhabitants on " + internationalSpaceStation.getName() + " now.");

    }
}
