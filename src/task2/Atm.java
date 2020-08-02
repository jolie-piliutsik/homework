package oop.tasks.task2;

public class Atm {
    public int notes20; //сумма денег в банкомате номиналом 20
    public int notes50; //сумма денег в банкомате номиналом 50
    public int notes100; //сумма денег в банкомате номиналом 100
    public int allCash; // все деньги в банкомате
    public int clientCash = 2330; //сумма денег, которую хочет снять клиент

    public Atm(int notes20, int notes50, int notes100) {
        this.notes20 = notes20;
        this.notes50 = notes50;
        this.notes100 = notes100;
    }
    public void addCashToAtm() {
        System.out.println("В банкомате денег: " + (allCash += notes20 * 20 + notes50 * 50 + notes100 * 100) + " рублей");
    }

    int numberOf100 = clientCash / 100; //количество купюр номиналом 20
    int numberOf50 = (clientCash - (numberOf100 * 100)) / 50; //количество купюр номиналом 50
    int numberOf20 = (clientCash - (numberOf50 * 100) - (numberOf50 * 50)) / 20; //количество купюр номиналом 20

    public void SuccessfulOperation() {
        boolean result = (clientCash <=19) && (clientCash <= allCash) && (clientCash > 0);
        System.out.println("Операция прошла успешно: " + result);
    }

    public void withdrawMoney() {
        if (clientCash > allCash) {
            System.out.println("Невозможно снять " + clientCash + " рублей");
        } else if ((clientCash - (numberOf100 * 100) - (numberOf50 * 50) - (numberOf20 * 20)) <= 19) {
            System.out.println("В банкомате нет нужных купюр. Введите другую сумму.");
        } else if (clientCash < allCash && clientCash > 0 && (numberOf100 != 0) && (numberOf50 == 0) && (numberOf20 == 0)) {
            System.out.println("Возьмите деньги: " + numberOf100 + " ед. по 100 рублей");
        } else if (clientCash < allCash && clientCash > 0 && (numberOf100 != 0) && (numberOf50 != 0) && (numberOf20 == 0)) {
            System.out.println("Возьмите деньги: " + numberOf100 + " ед. по 100 рублей, " + numberOf50 + " ед. по 50 рублей");
        } else {
            System.out.println("Возьмите деньги: " + numberOf100 + " ед. по 100 рублей, " + numberOf50 + " ед. по 50 рублей, " + ((clientCash - (numberOf50 * 50)-(numberOf20 * 20)) / 20) + " ед. по 20 рублей");
        }
    }
}