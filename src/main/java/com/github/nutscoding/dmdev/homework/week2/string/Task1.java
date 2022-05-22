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
        StringBuilder valueWithoutSpaces = removeSpaces(value);
        System.out.println(removeDuplicates(valueWithoutSpaces));
    }

    private static StringBuilder removeSpaces(String value) {
        char[] values = value.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            if (values[i] != ' ') {
                stringBuilder.append(values[i]);
            }
        }
        return stringBuilder;
    }

    private static String removeDuplicates(StringBuilder valueWithoutSpaces) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] values = valueWithoutSpaces.toString().toUpperCase().toCharArray();
        for (int i = 0; i < values.length; i++) {
            if (i == 0) {
                stringBuilder.append(values[i]);
                continue;
            }
            if (values[i] != values[i - 1]) {
                stringBuilder.append(values[i]);
            }
        }
        return stringBuilder.toString();
    }
}
