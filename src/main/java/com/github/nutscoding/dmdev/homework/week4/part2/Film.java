package com.github.nutscoding.dmdev.homework.week4.part2;


import com.github.nutscoding.dmdev.homework.week4.part2.util.Genre;

import java.time.Month;
import java.util.Objects;


public class Film implements Comparable<Film> {

    private int id;
    private int productionYear;
    private Month month;
    private Genre genre;
    private double rating;

    public Film(int id, int productionYear, Month month, Genre genre, double rating) {
        this.id = id;
        this.productionYear = productionYear;
        this.month = month;
        this.genre = genre;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public Month getMonth() {
        return month;
    }

    public Genre getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", productionYear=" + productionYear +
                ", month=" + month +
                ", genre=" + genre +
                ", rating=" + rating +
                '}';
    }

    @Override
    public int compareTo(Film film) {
        return Double.compare(film.getRating(), rating);
    } //добавить проверку на нал

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return id == film.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
