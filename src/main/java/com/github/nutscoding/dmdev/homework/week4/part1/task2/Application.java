package com.github.nutscoding.dmdev.homework.week4.part1.task2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        System.out.println(getAdultUsers());
        System.out.println(getMinorsAverageAge());
    }

    private static List<Chat> createChatList() {
        Chat chat1 = new Chat("java", Arrays.asList(
                new User(11, "Maria", 22),
                new User(3, "Viktor", 18)
        ));
        Chat chat2 = new Chat("python", Arrays.asList(
                new User(33, "Ivan", 15),
                new User(7, "Nina", 11)
        ));
        Chat chat3 = new Chat("C++", Arrays.asList(
                new User(25, "Petr", 55),
                new User(1, "Nikolay", 26)
        ));

        return Arrays.asList(chat1, chat2, chat3);
    }

    private static List<User> createAllUsersList() {
        List<User> allUsers = new ArrayList<>();
        for (Chat next : createChatList()) {
            allUsers.addAll(next.listOfUsers);
        }
        return allUsers;
    }

    private static List<User> getAdultUsers() {
        List<User> adultUsers = new ArrayList<>();
        for (User next : createAllUsersList()) {
            if (next.getAge() > 17) {
                adultUsers.add(next);
            }
        }
        return adultUsers;
    }

    private static int getMinorsAverageAge() {
        int counter = 0;
        int allMinorsAge = 0;
        for (User next : createAllUsersList()) {
            if (next.getAge() < 18) {
                allMinorsAge += next.getAge();
                counter++;
            }
        }
        return allMinorsAge / counter;
    }
}
