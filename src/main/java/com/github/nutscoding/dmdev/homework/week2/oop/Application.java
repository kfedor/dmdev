package com.github.nutscoding.dmdev.homework.week2.oop;

public class Application {

    public static void main(String[] args) {
        TownHouse townHouse1 = buildTownHouse();
        printAllInformation(townHouse1);
    }

    private static void printAllInformation(TownHouse townHouse) {
        townHouse.print(townHouse.getNumber(), townHouse.getFloors());
    }

    private static TownHouse buildTownHouse() {
        Room room1Apartment1 = new Room(false);
        Room[] roomsApartment1 = {room1Apartment1};
        Room room1Apartment2 = new Room(false);
        Room[] roomsApartment2 = {room1Apartment2};
        Room room1Apartment3 = new Room(false);
        Room room2Apartment3 = new Room(false);
        Room[] roomsApartment3 = {room1Apartment3, room2Apartment3};
        Room room1Apartment4 = new Room(true);
        Room room2Apartment4 = new Room(true);
        Room room3Apartment4 = new Room(false);
        Room[] roomsApartment4 = {room1Apartment4, room2Apartment4, room3Apartment4};
        Room room1Apartment5 = new Room(false);
        Room[] roomsApartment5 = {room1Apartment5};
        Room room1Apartment6 = new Room(false);
        Room[] roomsApartment6 = {room1Apartment6};
        Room room1Apartment7 = new Room(false);
        Room room2Apartment7 = new Room(false);
        Room[] roomsApartment7 = {room1Apartment7, room2Apartment7};
        Room room1Apartment8 = new Room(true);
        Room room2Apartment8 = new Room(true);
        Room room3Apartment8 = new Room(false);
        Room[] roomsApartment8 = {room1Apartment8, room2Apartment8, room3Apartment8};
        Apartment apartment1 = new Apartment(1, roomsApartment1);
        Apartment apartment2 = new Apartment(2, roomsApartment2);
        Apartment apartment3 = new Apartment(3, roomsApartment3);
        Apartment apartment4 = new Apartment(4, roomsApartment4);
        Apartment apartment5 = new Apartment(5, roomsApartment5);
        Apartment apartment6 = new Apartment(6, roomsApartment6);
        Apartment apartment7 = new Apartment(7, roomsApartment7);
        Apartment apartment8 = new Apartment(8, roomsApartment8);
        Apartment[] apartmentsFirstFloor = {apartment1, apartment2, apartment3, apartment4};
        Apartment[] apartmentsSecondFloor = {apartment5, apartment6, apartment7, apartment8};
        Floor floor1 = new Floor(1, apartmentsFirstFloor);
        Floor floor2 = new Floor(2, apartmentsSecondFloor);
        Floor[] floors = {floor1, floor2};
        return new TownHouse(1, floors);
    }
}
