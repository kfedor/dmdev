package com.github.nutscoding.dmdev.homework.week4.part1.task1;


import com.github.nutscoding.dmdev.homework.week4.part1.task1.comparator.UserAmountComparator;

import java.util.*;

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
public class ChatRunner {

    public static final int SMALL_CHAT_AMOUNT_OF_USERS = 1000;

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
            if (next.getUserAmount() >= SMALL_CHAT_AMOUNT_OF_USERS) {
                chatList1.add(next);
            }
        }
        return chatList1;
    }
}
