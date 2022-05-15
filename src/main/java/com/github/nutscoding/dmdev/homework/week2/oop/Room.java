package com.github.nutscoding.dmdev.homework.week2.oop;

class Room {

    private boolean passable;

    public Room(boolean passable) {
        this.passable = passable;
    }

    void print(boolean passable) {
        if (passable) {
            System.out.println("You can walk throw this room.");
        } else {
            System.out.println("Room is not passable.");
        }
    }

    public boolean isPassable() {
        return passable;
    }

    public void setPassable(boolean passable) {
        this.passable = passable;
    }
}
