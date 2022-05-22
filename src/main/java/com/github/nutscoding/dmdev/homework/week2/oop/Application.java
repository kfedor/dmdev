package com.github.nutscoding.dmdev.homework.week2.oop;

public class Application {

    public static void main(String[] args) {
        TownHouse townHouse = buildTownHouse();
        printAllInformation(townHouse);
    }

    private static void printAllInformation(TownHouse townHouse) {
        townHouse.print(townHouse.getNumber());
    }

    private static TownHouse buildTownHouse() {
        Room[] roomsApartment1 = {
                new Room(false)
        };
        Room[] roomsApartment2 = {
                new Room(false)
        };
        Room[] roomsApartment3 = {
                new Room(false),
                new Room(false)
        };
        Room[] roomsApartment4 = {
                new Room(true),
                new Room(true),
                new Room(false)
        };
        Room[] roomsApartment5 = {
                new Room(false)
        };
        Room[] roomsApartment6 = {
                new Room(false)
        };
        Room[] roomsApartment7 = {
                new Room(false),
                new Room(false)
        };
        Room[] roomsApartment8 = {
                new Room(true),
                new Room(true),
                new Room(true)
        };
        Apartment[] apartmentsFirstFloor = {
                new Apartment(1, roomsApartment1),
                new Apartment(2, roomsApartment2),
                new Apartment(3, roomsApartment3),
                new Apartment(4, roomsApartment4)
        };
        Apartment[] apartmentsSecondFloor = {
                new Apartment(5, roomsApartment5),
                new Apartment(6, roomsApartment6),
                new Apartment(7, roomsApartment7),
                new Apartment(8, roomsApartment8)
        };
        Floor[] floors = {
                new Floor(1, apartmentsFirstFloor),
                new Floor(2, apartmentsSecondFloor)
        };
        return new TownHouse(1, floors);
    }
}
