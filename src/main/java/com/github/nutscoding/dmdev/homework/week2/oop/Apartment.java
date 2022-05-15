package com.github.nutscoding.dmdev.homework.week2.oop;

class Apartment {

    private int number;
    private Room[] rooms;

    public Apartment(int number, Room[] rooms) {
        this.number = number;
        this.rooms = rooms;
    }

    void print(int number, Room[] rooms) {
        System.out.println("Apartment No." + number + " has "
                + rooms.length + definePlural(rooms));
        for (int i = 0; i < rooms.length; i++) {
            rooms[i].print(rooms[i].isPassable());
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

    public void setNumber(int number) {
        this.number = number;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }
}
