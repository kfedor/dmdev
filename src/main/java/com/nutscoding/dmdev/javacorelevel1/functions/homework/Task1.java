package com.nutscoding.dmdev.javacorelevel1.functions.homework;

/**
 * В переменной minutes лежит число от 0 до 59.
 * Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
 * в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
 * <p>
 * Протестировать функцию в main.
 */
public class Task1 {

    public static void main(String[] args) {
        int minutes = 14;
        print(minutes);
    }

    public static void print(int minutes) {
        if (minutes <= 15) {
            System.out.println("Число " + minutes + " попадает в первую четверть часа.");
        } else if (minutes <= 30) {
            System.out.println("Число " + minutes + " попадает во вторую четверть часа.");
        } else if (minutes <= 45) {
            System.out.println("Число " + minutes + " попадает в третью четверть часа.");
        } else if (minutes <= 59) {
            System.out.println("Число " + minutes + " попадает в четвертую четверть часа.");
        }
    }
}

