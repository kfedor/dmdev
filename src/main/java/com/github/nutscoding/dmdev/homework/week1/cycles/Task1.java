package com.github.nutscoding.dmdev.homework.week1.cycles;

/**
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число,
 * а возвращать количество четных цифр (вторая функция - нечетных).
 * <p>
 * Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
 */
public class Task1 {

    public static void main(String[] args) {
        int value = 2674821;
        int evenNumbers = countEvenNumbers(value);
        int oddNumbers = countOddNumbers(value);
        System.out.println("Число " + value
                + " содержит:\n" + "чётных цифр - " + evenNumbers
                + "\nнечётных цифр - " + oddNumbers);
    }

    public static int countEvenNumbers(int value) {
        int result = 0;
        while (value % 10 > 0) {
            int remain = value % 10;
            if (remain % 2 == 0) {
                result++;
            }
            value = value / 10;
        }
        return result;
    }

    public static int countOddNumbers(int value) {
        int result = 0;
        while (value % 10 > 0) {
            int remain = value % 10;
            if (remain % 2 != 0) {
                result++;
            }
            value = value / 10;
        }
        return result;
    }
}
