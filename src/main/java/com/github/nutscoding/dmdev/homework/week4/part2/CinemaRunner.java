package com.github.nutscoding.dmdev.homework.week4.part2;

import com.github.nutscoding.dmdev.homework.week4.part2.util.Genre;

import java.time.Month;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 * Даны 2 класса:
 * <p>
 * - Фильм с 5-ю полями: Уникальный Целочисленный идентификатор (id), Год издания, Месяц издания, Жанр и Рейтинг;
 * <p>
 * - Кинотеатр, где есть всего лишь одно единственное поле: отсортированный ассоциативный массив,
 * где ключом является год издания, а значением - все фильмы, выпущенные в этом году.
 * <p>
 * Добавить функционал в кинотеатр таким образом, чтобы можно было:
 * <p>
 * - добавлять в него новый фильм
 * <p>
 * - получить все фильмы по переданному году
 * <p>
 * - получить все фильмы по переданному году и месяцу
 * <p>
 * - получить все фильмы по переданному жанру
 * <p>
 * - получать ТОП-10 фильмов отсортированные по Рейтингу в порядке убывания
 * <p>
 * Учесть следующее:
 * <p>
 * - в кинотеатре фильмы должны храниться в порядке их добавления в него
 * (т.е. предусмотреть порядок значения ассоциативного массива)
 * <p>
 * - не должен добавляться фильм, если такой уже есть в кинотеатре
 * <p>
 * Продемонстрировать работу кинотеатра в отдельном классе.
 */
public class CinemaRunner {

    public static void main(String[] args) {
        Cinema cinema = createCinema();
        System.out.println();
        System.out.println(cinema.getFilmsByYear(2005));
        System.out.println();
        System.out.println(cinema.getFilmsByYearAndMonth(1999, Month.APRIL));
        System.out.println();
        System.out.println(cinema.getFilmsByGenre(Genre.ACTION));
        System.out.println();
        System.out.println(cinema.getTopTen());
    }

    private static Cinema createCinema() {
        Film film = new Film(1, 2000, Month.JANUARY, Genre.COMEDY, 5.5);
        Film film1 = new Film(3, 2005, Month.APRIL, Genre.HORROR, 3.0);
        Film film2 = new Film(5, 2005, Month.DECEMBER, Genre.DRAMA, 7.6);
        Film film3 = new Film(33, 1999, Month.JANUARY, Genre.COMEDY, 6.8);
        Film film4 = new Film(99, 2005, Month.APRIL, Genre.HORROR, 7.1);
        Film film5 = new Film(45, 2015, Month.DECEMBER, Genre.DRAMA, 9.0);
        Cinema cinema = new Cinema(new LinkedHashMap<>());

        cinema.addFilmToCinema(film);
        cinema.addFilmToCinema(film1);
        cinema.addFilmToCinema(film2);
        cinema.addFilmToCinema(film3);
        cinema.addFilmToCinema(film4);
        cinema.addFilmToCinema(film5);
        return cinema;
    }
}
