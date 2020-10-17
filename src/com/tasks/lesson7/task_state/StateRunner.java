package com.tasks.lesson7.task_state;

public class StateRunner {
    public static void main(String[] args) {
        State state = new State();

        state.printCapital("Минск");

        state.addRegion(new Region("Брестская"));
        state.addRegion(new Region("Гродненская"));
        state.addRegion(new Region("Витебская"));
        state.addRegion(new Region("Могилевская"));
        state.addRegion(new Region("Гомельская"));
        state.addRegion(new Region("Минская"));

        state.printNumberOfRegions();

        state.printArea(207);

        state.addCity(new City("Брест"));
        state.addCity(new City("Гродно"));
        state.addCity(new City("Витебск"));
        state.addCity(new City("Могилев"));
        state.addCity(new City("Гомель"));
        state.addCity(new City("Минск"));

        state.printCities();
    }
}