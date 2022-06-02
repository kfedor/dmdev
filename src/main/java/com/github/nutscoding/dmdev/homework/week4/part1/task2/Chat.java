package com.github.nutscoding.dmdev.homework.week4.part1.task2;


import java.util.List;

public class Chat implements Comparable<Chat> {

    private String name;
    private List<User> listOfUsers;

    public Chat(String name, List<User> listOfUsers) {
        this.name = name;
        this.listOfUsers = listOfUsers;
    }

    public String getName() {
        return name;
    }

    public List<User> getListOfUsers() {
        return listOfUsers;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "name='" + name + '\'' +
                ", listOfUsers=" + listOfUsers +
                '}';
    }

    @Override
    public int compareTo(Chat o) {
        if (o == null) {
            throw new NullPointerException();
        } else {
            return name.compareTo(o.name);
        }

    }
}
