package com.github.nutscoding.dmdev.homework.week4.part1.task2;

import java.util.List;

/**
 * Дан список чатов с предыдущего задания, только вместо поля “количество пользователей”
 * будет список объектов типа Пользователь, который имеет 3 поля: id (целочисленный идентификатор), имя и возраст.
 * <p>
 * Задача:
 * <p>
 * - Преобразовать список чатов в один список пользователей всех чатов, возраст которых больше 18 лет
 * <p>
 * - С помощью итератора посчитать средний возраст всех оставшихся пользователей.
 */
public class Chat implements Comparable<Chat> {

    private String name;
    List<User> listOfUsers;

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
        return this.name.compareTo(o.name);
    }
}
