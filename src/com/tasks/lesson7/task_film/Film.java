package com.tasks.lesson7.task_film;

/**
 * Создать класс Фильм с внутренним классом, с помощью объектов которого можно хранить информацию о продолжительности,
 * жанре и режиссерах фильма.
 */
public class Film {

    private String name;
    private FilmInformation filmInformation;

    public Film(String name) {
        this.name = name;
        this.filmInformation = new FilmInformation(194, "драма", "Джеймс Кэмерон");
    }

    public class FilmInformation {
        private int duration;
        private String genre;
        private String directors;

        public FilmInformation(int duration, String genre, String directors) {
            this.duration = duration;
            this.genre = genre;
            this.directors = directors;
        }

        public void printInfo() {
            System.out.println("Информация о фильме " + Film.this.name);
            System.out.println("длительность: " + filmInformation.getDuration() + " мин.");
            System.out.println("жанр: " + filmInformation.getGenre());
            System.out.println("режиссер: " + filmInformation.getDirectors());
        }

        public int getDuration() {
            return duration;
        }

        public String getGenre() {
            return genre;
        }

        public String getDirectors() {
            return directors;
        }
    }
}