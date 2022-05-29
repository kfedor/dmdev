package com.github.nutscoding.dmdev.homework.week4.part1.task1;


import com.github.nutscoding.dmdev.homework.week4.part1.task1.comparator.UserAmountComparator;

import java.util.*;

public class ChatRunner {

    public static void main(String[] args) {
        List<Chat> chatList = Arrays.asList(
                new Chat("chatA", 67),
                new Chat("chatB", 1156),
                new Chat("chatC", 10006)
        );

        Iterator<Chat> iterator = chatList.iterator();

        while (iterator.hasNext()) {
            Chat next = iterator.next();
            if (next.getUserAmount() < 1000) {
                iterator.remove();
            }
        }

        Collections.sort(chatList);
        System.out.println(chatList);

        chatList.sort(new UserAmountComparator());
        System.out.println(chatList);

    }
}
