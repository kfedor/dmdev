package com.github.nutscoding.dmdev.homework.week3.space;

public class SpaceShip {

    private int capacity;
    private int number;
    private int speed;

    public SpaceShip(int capacity, int number, int speed) {
        this.capacity = capacity;
        this.number = number;
        this.speed = speed;
    }

    public void goToEarth(SpaceShip spaceShip) {
        System.out.println(spaceShip.number + " went back to Earth.");
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumber() {
        return number;
    }

    public int getSpeed() {
        return speed;
    }
}
