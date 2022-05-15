package com.github.nutscoding.dmdev.homework.week2.arrays;


/**
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число -
 * это код символа (любой символ - это число в памяти компьютера).
 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
 * <p>
 * Далее определить среднее арифметическое всех элементов целочисленного массива
 * и вывести на консоль только те элементы, которые больше этого среднего арифметического.
 */

public class Task2 {

    public static void main(String[] args) {
        char[] array = {'a', '6', 'y', 'P', 'T', 'q', '9', '+'};
        int[] values = findCharCode(array);
        int arithmeticMean = findArithmeticMean(values);
        printNumbersAboveArithmeticMean(values, arithmeticMean);
    }

    private static int[] findCharCode(char[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = (int) array[i];
        }
        return values;
    }

    private static int findArithmeticMean(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum / values.length;
    }

    private static void printNumbersAboveArithmeticMean(int[] values, int arithmeticMean) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] > arithmeticMean) {
                System.out.print(values[i] + " ");
            }
        }
    }
}

