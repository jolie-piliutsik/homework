package task1;

import com.sun.deploy.association.Action;

public class Time {
    public int sec;
    public int min;
    public int hours;

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    //создаём конструктор, получающий часы, минуты, секунды в объекте
    public Time(int hours, int min, int sec) {
        this.sec = sec;
        this.min = min;
        this.hours = hours;
    }

    //метод получения секунд в объекте
    public void calculateSeconds() {
        if (sec <= 60 && min <= 60 && hours <= 24) {
            System.out.println("В объекте " + (hours * 3600 + min * 60 + sec) + " секунд");
        } else {
            System.out.println("Error!");
        }
    }

    //метод сравнения 2 объектов
    public boolean equals(Time time1) {
        return (this == time1);
    }
}








