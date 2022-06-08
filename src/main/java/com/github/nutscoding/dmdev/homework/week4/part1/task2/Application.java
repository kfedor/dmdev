package com.github.nutscoding.dmdev.homework.week4.part1.task2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
public class Application {

    public static final int ADULT = 18;

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
            allUsers.addAll(next.getListOfUsers());
        }
        return allUsers;
    }

    private static List<User> getAdultUsers() {
        List<User> adultUsers = new ArrayList<>();
        for (User user : createAllUsersList()) {
            if (user.getAge() >= ADULT) {
                adultUsers.add(user);
            }
        }
        return adultUsers;
    }

    private static double getMinorsAverageAge() {
        int counter = 0;
        double allMinorsAge = 0;
        for (User next : createAllUsersList()) {
            if (next.getAge() < ADULT) {
                allMinorsAge += next.getAge();
                counter++;
            }
        }
        return allMinorsAge / counter;
    }
}
