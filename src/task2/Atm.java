package task2;

public class Atm {
    public int numberOfNotes20; //количество купюр в банкомате номиналом 20
    public int numberOfNotes50; //количество купюр в банкомате номиналом 50
    public int numberOfNotes100; //количество купюр в банкомате номиналом 100

    //конструктор
    public Atm(int numberOfNotes20, int numberOfNotes50, int numberOfNotes100) {
        this.numberOfNotes20 = numberOfNotes20;
        this.numberOfNotes50 = numberOfNotes50;
        this.numberOfNotes100 = numberOfNotes100;
    }

    //геттеры, сеттеры
    public int getNumberOfNotes20() {
        return numberOfNotes20;
    }

    public void setNumberOfNotes20(int numberOfNotes20) {
        this.numberOfNotes20 = numberOfNotes20;
    }

    public int getNumberOfNotes50() {
        return numberOfNotes50;
    }

    public void setNumberOfNotes50(int numberOfNotes50) {
        this.numberOfNotes50 = numberOfNotes50;
    }

    public int getNumberOfNotes100() {
        return numberOfNotes100;
    }

    public void setNumberOfNotes100(int numberOfNotes100) {
        this.numberOfNotes100 = numberOfNotes100;
    }

    //добавление денег в банкомат
    public int addingMoneyToAtm(int numberOfNotes20, int numberOfNotes50, int numberOfNotes100) {
        return getNumberOfNotes20() * 20 + getNumberOfNotes50() * 50 + getNumberOfNotes100() * 100;
    }


    //сумма денег, которую хочет снять клиент
    public int clientCash;

    //геттер, сеттер
    public int getClientCash() {
        return clientCash;
    }

    public void setClientCash(int clientCash) {
        this.clientCash = clientCash;
    }

    //операция удалась или нет
    public void resultOfOperation(int clientCash) {
        boolean result = clientCash % 10 != 0 && clientCash >= 20 && clientCash <= getNumberOfNotes20() * 20 + getNumberOfNotes50() * 50 + getNumberOfNotes100() * 100;
        System.out.println("Операция прошла успешно: " + result);
    }

    //снятие денег по номиналам
    public void printNominalOfNotes(int clientCash) {
        if (clientCash % 10 != 0) {
            System.out.println("Введите другую сумму");
        } else if (clientCash >= 20 && clientCash <= getNumberOfNotes20() * 20 + getNumberOfNotes50() * 50 + getNumberOfNotes100() * 100) {
            System.out.println("Возьмите деньги: " + clientCash / 100 + " ед. по 100 рублей, " + (clientCash % 100 / 50) + " ед. по 50 рублей, " + (clientCash % 100 % 50 / 20) + " ед. по 20 рублей");
        }
    }
}
