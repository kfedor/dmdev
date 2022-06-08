package com.github.nutscoding.dmdev.homework.week4.part2;

import com.github.nutscoding.dmdev.homework.week4.part2.util.Genre;

import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Cinema {

    private Map<Integer, Set<Film>> films;

    public Cinema(Map<Integer, Set<Film>> films) {
        this.films = films;
    }

    public boolean addFilmToCinema(Film film) {
        Set<Film> inputFilm = new LinkedHashSet<>();
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

    public Set<Film> getFilmsByYear(int year) {
        if (films.get(year) == null) {
            return films.getOrDefault(year, new LinkedHashSet<>());
        } else {
            return new LinkedHashSet<>(films.get(year));
        }
    }

    public Set<Film> getFilmsByYearAndMonth(int year, Month month) {
        Set<Film> filmsByYear = new LinkedHashSet<>(getFilmsByYear(year));
        Set<Film> filmsByYearAndMonth = new LinkedHashSet<>();
        if (films.isEmpty()) {
            return new LinkedHashSet<>();
        } else {
            for (Film film : filmsByYear) {
                if (film.getMonth().equals(month)) {
                    filmsByYearAndMonth.add(film);
                }
            }
            if (filmsByYearAndMonth.isEmpty()) {
                System.out.println("There are no films released in " + month + " " + year + " in our cinema.");
            }
        }
        return filmsByYearAndMonth;
    }

    public Set<Film> getFilmsByGenre(Genre genre) {
        Set<Film> filmsByGenre = new LinkedHashSet<>();
        for (Set<Film> filmsList : films.values()) {
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

    public List<Film> getTopTen() {
        List<Film> topFilms = new ArrayList<>();
        for (Set<Film> filmList : films.values()) {
            topFilms.addAll(filmList);
        }
        if (topFilms.isEmpty()) {
            System.out.println("There are no films in our cinema.");
            return topFilms;
        }
        Collections.sort(topFilms);
        if (topFilms.size() < 10) {
            System.out.println("Our cinema has only " + topFilms.size() + " films. Here is their rating: ");
            return topFilms;
        } else {
            return topFilms.subList(0, 10);
        }
    }

    public Map<Integer, Set<Film>> getFilms() {
        return films;
    }
}
