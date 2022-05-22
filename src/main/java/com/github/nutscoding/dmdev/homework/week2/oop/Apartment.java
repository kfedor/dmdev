package com.github.nutscoding.dmdev.homework.week2.oop;

class Apartment {

    private final int number;
    private Room[] rooms;

    public Apartment(int number, Room[] rooms) {
        this.number = number;
        this.rooms = rooms;
    }

    void print(int number) {
        System.out.println("Apartment No." + number + " has "
                + this.rooms.length + definePlural(this.rooms));
        for (int i = 0; i < this.rooms.length; i++) {
            this.rooms[i].print(this.rooms[i].isPassable());
        }
    }

    private String definePlural(Room[] rooms) {
        if (rooms.length > 1) {
            return " rooms.";
        } else {
            return " room.";
        }
    }

    public int getNumber() {
        return number;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }
}
