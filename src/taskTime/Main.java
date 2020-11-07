package taskTime;

public class Main {
    public static void main(String[] args) {
        Time time1 = new Time(3, 3, 3);
        System.out.println("В объекте №1: " + time1.getInSeconds() + " секунд");

        Time time2 = new Time(10983);
        System.out.println("В объекте №2: " + time2.sec + " секунд");

        //сравниваем 2 объекта
        System.out.println("Объекты равны: " + (time1.getInSeconds() == time2.sec));
        ;
    }
}