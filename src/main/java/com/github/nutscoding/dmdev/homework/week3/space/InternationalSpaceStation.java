package com.github.nutscoding.dmdev.homework.week3.space;

public class InternationalSpaceStation extends SpaceObject {

    private SpaceShip[] spaceShips;

    public InternationalSpaceStation(String name, double weight, double distanceToEarth, SpaceShip[] spaceShips) {
        super(name, weight, distanceToEarth);
        this.spaceShips = spaceShips;
    }

    public int countInhabitants(SpaceShip[] spaceShips) {
        int count = 0;
        for (SpaceShip spaceShip : spaceShips) {
            count += spaceShip.getCapacity();
        }
        return count;
    }

    public SpaceShip[] getSpaceShips() {
        return spaceShips;
    }

    @Override
    public void specialFeature() {
        System.out.println("Serves for exploring space");
    }
}
