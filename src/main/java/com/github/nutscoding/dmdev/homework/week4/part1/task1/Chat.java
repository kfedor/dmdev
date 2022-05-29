package com.github.nutscoding.dmdev.homework.week4.part1.task1;

/**
 * Дан список чатов.
 * Каждый чат состоит из двух полей: название и количество пользователей в этом чате.
 * <p>
 * Задача:
 * <p>
 * - Удалить с помощью итератора из этого списка те чаты, что содержат менее 1000 пользователей.
 * <p>
 * - Оставшиеся чаты отсортировать с помощью компараторов по убыванию по количеству пользователей,
 * а если это количество совпадает, то по названию в алфавитном порядке.
 * <p>
 * - Также предоставить сортировку чатов по названию по умолчанию.
 */
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
        return this.name.compareTo(o.name);
    }
}
