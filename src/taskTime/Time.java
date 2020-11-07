/*Создать класс и объекты описывающие промежуток времени. Сам промежуток
в классе должен задаваться тремя свойствами: секундами, минутами, часами.

Сделать методы для получения полного количества секунд в объекте, сравнения
двух объектов. Создать два конструктора: получающий общее количество секунд,
и часы, минуты и секунды по отдельности. Сделать метод для вывода данных.
*/

package taskTime;

public class Time {
    public int sec;
    public int min;
    public int hours;

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        if (sec > 60) {
            throw new IllegalArgumentException("Неверное значение в секундах");
        } else {
            this.sec = sec;
        }
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        if (min > 60) {
            throw new IllegalArgumentException("Неверное значение в минутах");
        } else {
            this.min = min;
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours > 60) {
            throw new IllegalArgumentException("Неверное значение в часах");
        } else {
            this.hours = hours;
        }
    }

    //конструктор, получающий часы, минуты, секунды в объекте
    public Time(int hours, int min, int sec) {
        setHours(hours);
        setMin(min);
        setSec(sec);
    }

    //конструктор, получающий общее количество секунд
    public Time(int sec) {
        this.sec = sec;
    }

    //получение секунд в объекте
    public int getInSeconds() {
        return hours * 3600 + min * 60 + sec;
    }
}