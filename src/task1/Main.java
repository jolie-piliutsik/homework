package task1;

public class Main {
    public static void main(String[] args) {
        //секунды в объекте1
        Time time1 = new Time(2, 75, 1000);
        System.out.println("В объекте №1 секунд: " + time1.calculateSeconds());

        //секунды в объекте2
        Time time2 = new Time(3, 71, 10);
        System.out.println("В объекте №2 секунд: " + time2.calculateSeconds());

        //сравнение 2 объектов по количеству секунд
        boolean compareTwoObjects = time1.calculateSeconds() > time2.calculateSeconds();
        System.out.println("Количество секунд в объекте №1 больше, чем в объекте №2: " + compareTwoObjects);

        //часов, минут, секунд в объекте
        Time time3 = new Time(15828);
        time3.printHoursMinutesSecondsInObject();
    }
}



