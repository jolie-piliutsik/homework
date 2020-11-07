package com.tasks.lesson7.task_film;

public class FilmRunner {
    public static void main(String[] args) {
        Film film = new Film("Титаник");
        Film.FilmInformation filmInformation = film.new FilmInformation(0, "0", "0");
        filmInformation.printInfo();
    }
}