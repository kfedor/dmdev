package com.nutscoding.dmdev.javacorelevel1.cycles.practice;

import java.util.Scanner;

/**
 * Написать программу, вычисляющую сумму цифр введённого пользователем целого числа.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int result = sum(value);
        System.out.println(result);
    }
    public static int sum (int value){
        int result = 0;
        while (value != 0){
            result = result + (value % 10);
            value = value / 10;
        }

        return result;
    }
}
