package com.github.nutscoding.dmdev.homework.week4.part2;

import com.github.nutscoding.dmdev.homework.week4.part2.util.Genre;

import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Cinema {

    private Map<Integer, List<Film>> films;

    public Cinema(Map<Integer, List<Film>> films) {
        this.films = films;
    }

    public boolean addFilmToCinema(Film film) {
        if (hasFilm(film)) {
            System.out.println("This " + film + " is already in the cinema.");
            return false;
        }
        List<Film> inputFilm = new ArrayList<>();
        if (films.containsKey(film.getProductionYear())) {
            inputFilm = films.get(film.getProductionYear());
            inputFilm.add(film);
        } else {
            inputFilm.add(film);
        }
        films.put(film.getProductionYear(), inputFilm);
        System.out.println(film + " has been successfully added to the cinema.");
        return true;
    }

    public List<Film> getFilmsByYear(int year) {
        if (films.get(year) == null) {
            System.out.println("There are no films released in " + year + " in our cinema.");
            return new ArrayList<>();
        } else {
            return new ArrayList<>(films.get(year));
        }
    }

    public List<Film> getFilmsByMonth(int year, Month month) {
        List<Film> filmsByYear = new ArrayList<>(getFilmsByYear(year));
        List<Film> filmsByMonth = new ArrayList<>();
        if (films.isEmpty()) {
            return getFilmsByYear(year);
        } else {
            for (Film film : filmsByYear) {
                if (film.getMonth().equals(month)) {
                    filmsByMonth.add(film);
                }
            }
            if (filmsByMonth.isEmpty()) {
                System.out.println("There are no films released in " + month + " " + year + " in our cinema.");
            }
        }
        return filmsByMonth;
    }

    public List<Film> getFilmsByGenre(Genre genre) {
        List<Film> filmsByGenre = new ArrayList<>();
        for (List<Film> filmsList : films.values()) {
            for (Film film : filmsList) {
                if (film.getGenre().equals(genre)) {
                    filmsByGenre.add(film);
                }
            }
        }
        if (filmsByGenre.isEmpty()) {
            System.out.println("There are no " + genre + " films in our cinema.");
        }
        return filmsByGenre;
    }

    public List<Film> getTopTen() { // добавить проверку на 10 фильмов
        ArrayList<Film> topFilms = new ArrayList<>();
        for (List<Film> filmList : films.values()) {
            topFilms.addAll(filmList);
        }
        if (topFilms.isEmpty()) {
            System.out.println("There are no films in our cinema.");
            return topFilms;
        }
        Collections.sort(topFilms);
        if (topFilms.size() < 10) {
            System.out.println("Our cinema has only " + topFilms.size() + " films. Here is their rating: ");
        }
        return topFilms;
    }

    public boolean hasFilm(Film film) {
        for (List<Film> filmList : films.values()) {
            for (Film value : filmList) {
                if (value.equals(film)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Map<Integer, List<Film>> getFilms() {
        return films;
    }

}
