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
        List<Chat> chatList1 = removeChats(chatList);

        Collections.sort(chatList1);
        System.out.println("Default sorting " + chatList1);

        chatList1.sort(new UserAmountComparator());
        System.out.println("Custom sorting " + chatList1);
    }

    private static List<Chat> removeChats(List<Chat> chatList) {
        List<Chat> chatList1 = new ArrayList<>();
        for (Chat next : chatList) {
            if (next.getUserAmount() > 999) {
                chatList1.add(next);
            }
        }
        return chatList1;
    }
}
