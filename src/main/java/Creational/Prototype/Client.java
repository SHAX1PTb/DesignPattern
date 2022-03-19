package Creational.Prototype;

import java.util.List;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Flight flight = new Flight();
        flight.loadDefaultFlightList();

        Flight morningFlight = (Flight) flight.clone();
        List<String> morningFlightList = morningFlight.getDefaultFlightList();
        morningFlightList.add("Qatar");

        System.out.println("Default Flight List"+flight.getDefaultFlightList());
        System.out.println("morningFlight  List"+morningFlight.getDefaultFlightList());
    }
}
