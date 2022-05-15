package com.github.nutscoding.dmdev.homework.week1.functions;

/**
 * Даны 3 переменные:
 * <p>
 * - operand1 (double)
 * - operand2 (double)
 * - operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
 * <p>
 * Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
 * Протестировать функцию в main.
 * <p>
 * Например:
 * Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
 * Результат: 34.5 (24.4 + 10.1)
 */
public class Task2 {

    public static void main(String[] args) {
        double operand1 = 15.5;
        double operand2 = 18.8;
        char operation = '*';
        System.out.println("Результат операции равен: " +
                operationResult(operand1, operand2, operation));
    }

    public static double operationResult(double operand1, double operand2, char operation) {
        double result = 0;
        switch (operation) {
            case '+' -> result = operand1 + operand2;
            case '-' -> result = operand1 - operand2;
            case '*' -> result = operand1 * operand2;
            case '/' -> {
                if (operand2 == 0) {
                    throw new IllegalArgumentException("Делить на ноль нельзя!");
                }
                result = operand1 / operand2;
            }
            case '%' -> result = operand1 % operand2;
        }
        return result;
    }
}
