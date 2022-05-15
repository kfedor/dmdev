package com.github.nutscoding.dmdev.homework.week2.string;

/**
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом.
 * Также удалить пробелы.
 * Результат привести к верхнему регистру.
 * <p>
 * Например:
 * "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */

public class Task1 {

    public static void main(String[] args) {
        String value = "abc Cpddddddddddddd Dio OsfWw";
        value = value.replaceAll(" ", "");
        System.out.println(removeDuplicates(value));

    }

    private static String removeDuplicates(String value) {
        StringBuilder result = new StringBuilder();
        String[] values = value.split("");
        for (int i = 0; i < values.length; i++) {
            boolean repeated = false;
            for (int j = i + 1; j < values.length; j++) {
                if (values[i].equalsIgnoreCase(values[j])) {
                    repeated = true;
                    break;
                }
            }
            if (!repeated) {
                result.append(values[i]);
            }
        }
        return result.toString().toUpperCase();
    }
}
