package task1;

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

    public int allSec;

    //конструктор, получающий секунды
    public Time(int allSec) {
        this.allSec = allSec;
    }

    public int getAllSec() {
        return allSec;
    }

    public void setAllSec(int allSec) {
        this.allSec = allSec;
    }

    //получение только секунд в объекте
    public int calculateSeconds() {
        return hours * 3600 + min * 60 + sec;
    }


    //получение часов из объекта
    public int calculateHoursInObject() {
        return allSec / 3600;
    }

    //получение минут из объекта
    public int calculateMinutesInObject() {
        return (allSec - (calculateHoursInObject() * 3600)) / 60;
    }

    //получение секунд из объекта
    public int calculateSecondsInObject() {
        return (allSec - (calculateMinutesInObject() * 60) - (calculateHoursInObject() * 3600));
    }

    //метод вывода часов, минут, секунд в объекте
    public void printHoursMinutesSecondsInObject() {
        System.out.println("В объекте: " + calculateHoursInObject() + " часов " + calculateMinutesInObject() + " минут " + calculateSecondsInObject() + " секунд");
    }
}







