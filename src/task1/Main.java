package task1;

public class Main {
    public static void main(String[] args) {
        //секунд в объекте1
        Time time1 = new Time(2, 49, 19);
        time1.calculateSeconds();

        //секунд в объекте2
        Time time2 = new Time(3, 11, 10);
        time2.calculateSeconds();

        System.out.println("Объекты равны: " + time2.equals(time1));
    }
}



