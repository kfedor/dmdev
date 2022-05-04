package com.nutscoding.dmdev.javacorelevel1.functions.homework;

/**
 * Даны два прямоугольных треугольника.
 * Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
 * Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.
 * <p>
 * Для этого понадобится написать 2 функции.
 * Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
 * Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше,
 * меньше или равен второму.
 * Учитывать, что площадь может быть вещественным числом.
 */
public class Task3 {

    public static void main(String[] args) {
        double firstSideA = 25.2;
        double firstSideB = 41.2;
        double secondSideA = 13.9;
        double secondSideB = 10.1;
        double firstSquare = findSquare(firstSideA, firstSideB);
        double secondSquare = findSquare(secondSideA, secondSideB);
        compare(firstSquare, secondSquare);
    }

    public static double findSquare(double sideA, double sideB) {
        return sideA * sideB * 0.5;
    }

    public static void compare(double firstSquare, double secondSquare) {
        if (firstSquare < secondSquare) {
            System.out.println("Первый треугольник меньше второго.");
        } else if (firstSquare > secondSquare) {
            System.out.println("Первый треугольник больше второго.");
        } else {
            System.out.println("Первый треугольник равен второму.");
        }
    }
}
