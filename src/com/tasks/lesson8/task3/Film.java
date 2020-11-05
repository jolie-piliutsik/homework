package com.tasks.lesson8.task3;


import java.io.Serializable;

public class Film implements Serializable {
    private String name;
    private int duration;
    private String genre;

    public Film(String name, int duration, String genre) {
        this.name = name;
        this.duration = duration;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", genre='" + genre + '\'' +
                '}';
    }
}