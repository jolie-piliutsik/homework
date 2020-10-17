package com.tasks.lesson7.task_state;

public class City {

    private String name;

    public City(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Город{" +
                "название='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}