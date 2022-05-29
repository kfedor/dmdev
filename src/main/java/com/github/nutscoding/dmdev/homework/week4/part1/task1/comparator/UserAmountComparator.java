package com.github.nutscoding.dmdev.homework.week4.part1.task1.comparator;

import com.github.nutscoding.dmdev.homework.week4.part1.task1.Chat;

import java.util.Comparator;

public class UserAmountComparator implements Comparator<Chat> {

    @Override
    public int compare(Chat o1, Chat o2) {
        if (o1.getUserAmount() == o2.getUserAmount()) {
            return o1.getName().compareTo(o2.getName());
        } else if (o1.getUserAmount() < o2.getUserAmount()) {
            return 1;
        } else {
            return -1;
        }
    }
}
