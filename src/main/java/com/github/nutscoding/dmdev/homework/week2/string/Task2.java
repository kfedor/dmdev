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
        String[] primeNumbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int[] numbers = arrayOfNumbersFromString(value, primeNumbers);
        System.out.println(arraySum(numbers));
    }

    private static int[] arrayOfNumbersFromString(String value, String[] primeNumbers) {
        int[] result = new int[findArrayOfNumbersSize(value, primeNumbers)];
        String[] values = value.split("");
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < primeNumbers.length; j++) {
                if (values[i].contains(primeNumbers[j])) {
                    for (int k = 0; k < result.length; k++) {
                        if (result[k] == 0) {
                            result[k] = Integer.parseInt(values[i]);
                            break;
                        }
                    }
                }
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

    private static int findArrayOfNumbersSize(String value, String[] primeNumbers) {
        String[] values = value.split("");
        int counter = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < primeNumbers.length; j++) {
                if (values[i].equals(primeNumbers[j])) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
