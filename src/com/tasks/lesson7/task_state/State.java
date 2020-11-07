package com.tasks.lesson7.task_state;
/**
 * * Создать объект класса Государство, используя классы Область, Район, Город.
 * * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */

import java.util.*;

public class State {

    private String capital;
    private int area;

    private List<Region> regionList = new ArrayList<>(); //область
    private List<District> districtList = new ArrayList<>(); //регион
    private List<City> cityList = new ArrayList<>();

    //вывод столицы
    public void printCapital(String capital) {
        System.out.println("Столица: " + capital);
    }

    //вывод количества областей
    public void printNumberOfRegions() {
        System.out.println("Количество областей: " + regionList.size());
    }

    //вывод площади
    public void printArea(int area) {
        System.out.println("Площадь государства, км.2: " + area);
    }

    //вывод областных центров
    public void printCities() {
        System.out.println("Областные центры: " + cityList);
    }

    public void addRegion(Region region) {
        regionList.add(region);
    }

    public void addCity(City city) {
        cityList.add(city);
    }

    public List<Region> getRegionList() {
        return regionList;
    }

    public List<District> getDistrictList() {
        return districtList;
    }

    public List<City> getCityList() {
        return cityList;
    }

    @Override
    public String toString() {
        return "State{" +
                "regionList=" + regionList +
                ", districtList=" + districtList +
                ", cityList=" + cityList +
                ", capital='" + capital + '\'' +
                '}';
    }
}