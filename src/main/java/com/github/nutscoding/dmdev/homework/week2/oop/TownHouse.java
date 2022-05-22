package com.github.nutscoding.dmdev.homework.week2.oop;

class TownHouse {

    private final int number;
    private Floor[] floors;

    public TownHouse(int number, Floor[] floors) {
        this.number = number;
        this.floors = floors;
    }

    void print(int number) {
        System.out.println("TownHouse No." + number + " has " + floors.length + " floors.");
        for (int i = 0; i < floors.length; i++) {
            floors[i].print(floors[i].getNumber());
        }
    }

    public int getNumber() {
        return number;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public void setFloors(Floor[] floors) {
        this.floors = floors;
    }

}
