package com.github.nutscoding.dmdev.homework.week4.part1.task1;

public class Chat implements Comparable<Chat> {

    private String name;
    private int userAmount;

    public Chat(String name, int userAmount) {
        this.name = name;
        this.userAmount = userAmount;
    }

    public String getName() {
        return name;
    }

    public int getUserAmount() {
        return userAmount;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "name='" + name + '\'' +
                ", userAmount=" + userAmount +
                '}';
    }

    @Override
    public int compareTo(Chat o) {
        return name.compareTo(o.name);
    }
}
