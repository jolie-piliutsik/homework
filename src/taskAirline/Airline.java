package taskAirline;


public class Airline {
    public String destination;
    public int flightNumber;
    public String airplaneType;
    public double departureTime;
    public String daysOfWeek;


    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirplaneType() {
        return airplaneType;
    }

    public void setAirplaneType(String airplaneType) {
        this.airplaneType = airplaneType;
    }

    public double getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(double departureTime) {
        this.departureTime = departureTime;
    }

    public String getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(String daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    //конструктор
    public Airline(String destination, int flightNumber, String airplaneType, double departureTime, String daysOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.airplaneType = airplaneType;
        this.departureTime = departureTime;
        this.daysOfWeek = daysOfWeek;
    }

    // 1. Вывод списка рейсов для заданного пункта назначения
    public void printFlightsForDestination(String destination) {

        if (destination == getDestination()) {
            System.out.println("Destination: " + getDestination() + " |" + " Flight number: " + getFlightNumber() + " |" + " Airplane type: " + getAirplaneType() + " |" + " Departure time: " + getDepartureTime() + " |" + " Day of week: " + getDaysOfWeek());
            System.out.println();
        }
    }

    // 2. Вывод списка рейсов для заданного дня недели
    public void printFlightsForTheDay(String daysOfWeek) {
        if (daysOfWeek == getDaysOfWeek()) {
            System.out.println("Destination: " + getDestination() + " |" + " Flight number: " + getFlightNumber() + " |" + " Airplane type: " + getAirplaneType() + " |" + " Departure time: " + getDepartureTime() + " |" + " Day of week: " + getDaysOfWeek());
            System.out.println();
        }
    }

    // 3. Вывод списка рейсов для заданного дня недели, время вылета которых больше заданного
    public void printFlightsForTheDayAndTime(String daysOfWeek, double departureTime) {
        if (daysOfWeek == getDaysOfWeek() && getDepartureTime() > departureTime) {
            System.out.println("Destination: " + getDestination() + " |" + " Flight number: " + getFlightNumber() + " |" + " Airplane type: " + getAirplaneType() + " |" + " Departure time: " + getDepartureTime() + " |" + " Day of week: " + getDaysOfWeek());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Airline[] airline = new Airline[5];
        airline[0] = new Airline("Paris", 155, "Boeing", 14.11, "Sunday");
        airline[1] = new Airline("Vladivostok", 1901, "Tu", 10.05, "Monday");
        airline[2] = new Airline("Moscow", 436, "Airbus", 04.15, "Friday");
        airline[3] = new Airline("Kiyv", 6776, "Jet", 19.01, "Sunday");
        airline[4] = new Airline("Tbilisi", 867, "Il", 23.05, "Wednesday");

        // вывод №1
        System.out.println("Рейсы для заданного пункта назначения:");
        for (int i = 0; i < airline.length; i++) {
            airline[i].printFlightsForDestination("Tbilisi");
        }

        // вывод №2
        System.out.println("Рейсы для заданного дня недели:");
        for (int i = 0; i < airline.length; i++) {
            airline[i].printFlightsForTheDay("Sunday");
        }

        // вывод №3
        System.out.println("Рейсы для заданного дня недели, время вылета для которых больше заданного:");
        for (int i = 0; i < airline.length; i++) {
            airline[i].printFlightsForTheDayAndTime("Sunday", 16.00);
        }
    }
}







