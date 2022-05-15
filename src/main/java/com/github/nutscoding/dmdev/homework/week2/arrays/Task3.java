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
        divideToThreeArrays(initialArray);
        printNewArray(divideToThreeArrays(initialArray));
    }

    private static int[][] divideToThreeArrays(int[] initialArray) {
        int[] positiveArray = new int[findPositiveArrayLength(initialArray)];
        int tempForPositive = 0;
        int[] negativeArray = new int[findNegativeArrayLength(initialArray)];
        int tempForNegative = 0;
        int[] zerosArray = new int[findZerosArrayLength(initialArray)];
        int tempForZeros = 0;

        for (int i = 0; i < initialArray.length; i++) {
            if (initialArray[i] > 0) {
                positiveArray[tempForPositive] = initialArray[i];
                tempForPositive++;
            } else if (initialArray[i] < 0) {
                negativeArray[tempForNegative] = initialArray[i];
                tempForNegative++;
            } else {
                zerosArray[tempForZeros] = initialArray[i];
                tempForZeros++;
            }
        }
        return new int[][]{
                positiveArray, negativeArray, zerosArray
        };
    }

    private static int findPositiveArrayLength(int[] initialArray) {
        int count = 0;
        for (int i = 0; i < initialArray.length; i++) {
            if (initialArray[i] > 0) {
                count++;
            }
        }
        return count;
    }

    private static int findNegativeArrayLength(int[] initialArray) {
        int count = 0;
        for (int i = 0; i < initialArray.length; i++) {
            if (initialArray[i] < 0) {
                count++;
            }
        }
        return count;
    }

    private static int findZerosArrayLength(int[] initialArray) {
        int count = 0;
        for (int i = 0; i < initialArray.length; i++) {
            if (initialArray[i] == 0) {
                count++;
            }
        }
        return count;
    }

    private static void printNewArray(int[][] values) {
        for (int i = 0; i < values.length; i++) {
            int[] temp = values[i];
            for (int j = 0; j < temp.length; j++) {
                System.out.print(temp[j] + " ");
            }
            System.out.println();
        }
    }
}
