package com.github.nutscoding.dmdev.homework.week2.string;

/**
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * <p>
 * Написать 2 метода:
 * <p>
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * <p>
 * Посчитать сумму всех чисел из строки
 * <p>
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */
public class Task2 {

    public static void main(String[] args) {
        String value = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        int[] numbers = arrayOfNumbersFromString(value);
        System.out.println(arraySum(numbers));
    }

    private static int[] arrayOfNumbersFromString(String value) {
        int[] result = new int[findArrayOfNumbersSize(value)];
        char[] values = value.toCharArray();
        int counter = 0;
        for (int i = 0; i < values.length; i++) {
            if (Character.isDigit(values[i])){
                result[counter] = Integer.parseInt(String.valueOf(values[i]));
                counter++;
            }
        }
        return result;
    }

    private static int arraySum(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;
    }

    private static int findArrayOfNumbersSize(String value) {
        char[] values = value.toCharArray();
        int counter = 0;
        for (int i = 0; i < values.length; i++) {
            if (Character.isDigit(values[i])){
                counter++;
            }
        }
        return counter;
    }
}

