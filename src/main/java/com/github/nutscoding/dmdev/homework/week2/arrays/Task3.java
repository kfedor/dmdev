package com.github.nutscoding.dmdev.homework.week2.arrays;

/**
 * Дан одномерный массив целых чисел.
 * <p>
 * Написать функцию, которая принимает этот массив и разбивает на 3 других:
 * с только отрицательными числами, только положительными и только нули.
 * Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
 * Возвращает функция эти три массива в виде одного двумерного.
 * <p>
 * Пример:
 * [-4, -18]
 * <p>
 * [-4, 0, 1, 9, 0, -18, 3] -> [0, 0]
 * <p>
 * [1, 9, 3]
 */
public class Task3 {

    public static void main(String[] args) {
        int[] initialArray = {-4, 0, 1, 9, 0, -18, 3};
        printNewArray(createDoubleArray(initialArray));
    }

    private static int[][] createDoubleArray(int[] initialArray) {
        return new int[][]{
                createPositiveNumbersArray(initialArray),
                createNegativeNumbersArray(initialArray),
                createZeroNumbersArray(initialArray)
        };
    }

    private static int[] createPositiveNumbersArray(int[] initialArray) {
        int condition = 1;
        int[] positiveNumbersArray = new int[findArrayLength(initialArray, condition)];
        int counter = 0;
        for (int i = 0; i < initialArray.length; i++) {
            if (initialArray[i] > 0) {
                positiveNumbersArray[counter] = initialArray[i];
                counter++;
            }
        }
        return positiveNumbersArray;
    }

    private static int[] createNegativeNumbersArray(int[] initialArray) {
        int condition = -1;
        int[] negativeNumbersArray = new int[findArrayLength(initialArray, condition)];
        int counter = 0;
        for (int i = 0; i < initialArray.length; i++) {
            if (initialArray[i] < 0) {
                negativeNumbersArray[counter] = initialArray[i];
                counter++;
            }
        }
        return negativeNumbersArray;
    }

    private static int[] createZeroNumbersArray(int[] initialArray) {
        int condition = 0;
        int[] zeroNumbersArray = new int[findArrayLength(initialArray, condition)];
        int counter = 0;
        for (int i = 0; i < initialArray.length; i++) {
            if (initialArray[i] == 0) {
                zeroNumbersArray[counter] = initialArray[i];
                counter++;
            }
        }
        return zeroNumbersArray;
    }

    private static int findArrayLength(int[] initialArray, int condition) {
        int positiveCounter = 0;
        int negativeCounter = 0;
        int zeroCounter = 0;
        for (int i = 0; i < initialArray.length; i++) {
            if (initialArray[i] > 0) {
                positiveCounter++;
            } else if (initialArray[i] < 0) {
                negativeCounter++;
            } else {
                zeroCounter++;
            }

        }
        if (condition > 0) {
            return positiveCounter;
        } else if (condition < 0) {
            return negativeCounter;
        } else {
            return zeroCounter;
        }
    }

    private static void printNewArray(int[][] resultArray) {
        for (int i = 0; i < resultArray.length; i++) {
            int[] temp = resultArray[i];
            for (int j = 0; j < temp.length; j++) {
                System.out.print(temp[j] + " ");
            }
            System.out.println();
        }
    }
}
