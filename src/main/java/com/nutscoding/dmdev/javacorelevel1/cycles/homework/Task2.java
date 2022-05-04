package com.nutscoding.dmdev.javacorelevel1.cycles.homework;

/**
 * Дано целое число.
 * Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
 * Результат вывести на консоль.
 * Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
 * <p>
 * Примечание: для решения может понадобиться функция возведения числа в степень: Math.pow(число, степень)
 */
public class Task2 {

    public static void main(String[] args) {
        int value = 26748593;
        System.out.println(reverse(value));
    }

    public static int reverse(int value) {
        int result = 0;
        String a = String.valueOf(0);
        while (value % 10 > 1){
            a = a + String.valueOf(value % 10);
            value = value / 10;
            result = Integer.parseInt(a);
        }
        return result;
    }
}

