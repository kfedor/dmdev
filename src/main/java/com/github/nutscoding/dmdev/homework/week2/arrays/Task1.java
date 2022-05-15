package com.github.nutscoding.dmdev.homework.week2.arrays;

/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы
 * (удалить - значит создать новый массив с только положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 * <p>
 * Не забывать, что всю логику приложения нужно выносить в отдельные функции.
 * main - только для тестирования написанного функционала.
 */

public class Task1 {

    public static void main(String[] args) {
        int[] values = {3, 5, -6, 3, 2, -9, 0, -123};
        int[] arrayWithoutNegative = removeNegativeNumbers(values);
        int[] resultArray = multiply(arrayWithoutNegative);
        printNewArray(resultArray);
    }

    //Для таких простых методов, думаю, javadoc не нужны, но хотел попробовать написать в одном из заданий.
    /**
     * This method takes positive numbers and zeros from initial array,
     * and puts it to a new array.
     *
     * @param values - initial array
     * @return values2 - new array
     */
    private static int[] removeNegativeNumbers(int[] values) {
        int[] arrayWithoutNegative = new int[findNewArrayLength(values)];
        int temp = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] >= 0) {
                arrayWithoutNegative[temp] = values[i];
                temp++;
            }
        }
        return arrayWithoutNegative;
    }

    /**
     * This method multiples each number of the array on array length.
     *
     * @param arrayWithoutNegative - initial array
     * @return arrayWithoutNegative after multiplying
     */
    private static int[] multiply(int[] arrayWithoutNegative) {
        for (int i = 0; i < arrayWithoutNegative.length; i++) {
            arrayWithoutNegative[i] *= arrayWithoutNegative.length;
        }
        return arrayWithoutNegative;
    }

    /**
     * This method defines the amount of positive numbers and zeros in initial array.
     *
     * @param values - initial array
     * @return count - length to create new array
     */
    private static int findNewArrayLength(int[] values) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] >= 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * This method prints new array
     *
     * @param values2 - new array
     */
    private static void printNewArray(int[] values2) {
        for (int i = 0; i < values2.length; i++) {
            System.out.println(values2[i] + " ");
        }
    }
}