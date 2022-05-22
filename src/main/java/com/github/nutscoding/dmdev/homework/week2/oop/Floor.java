package com.github.nutscoding.dmdev.homework.week2.oop;

class Floor {

    private final int number;
    private Apartment[] apartments;

    public Floor(int number, Apartment[] apartments) {
        this.number = number;
        this.apartments = apartments;
    }

    void print(int number) {
        System.out.println("Floor No." + number + " has " + apartments.length + " apartments.");
        for (int i = 0; i < apartments.length; i++) {
            apartments[i].print(apartments[i].getNumber());
        }
    }

    public int getNumber() {
        return number;
    }

    public Apartment[] getApartments() {
        return apartments;
    }

    public void setApartments(Apartment[] apartments) {
        this.apartments = apartments;
    }
}
