package com.github.nutscoding.dmdev.homework.week2.oop;

class Room {

    private final boolean passable;

    public Room(boolean passable) {
        this.passable = passable;
    }

    void print(boolean passable) {
        String print = passable ? "You can walk throw this room." : "Room is not passable.";
        System.out.println(print);
    }


    public boolean isPassable() {
        return passable;
    }

}
