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
        while (value != 0){
            int temp = value % 10;
            result = result * 10 + temp;
            value = value / 10;
        }
        return result;
    }
}
