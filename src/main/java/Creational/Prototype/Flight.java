package main.java.Creational.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Flight implements Cloneable {

    private List<String > defaultFlightList;

    public Flight(){
        this.defaultFlightList = new ArrayList<>();
    }

    public Flight(List<String> temp) {
        this.defaultFlightList = temp;
    }

    public void loadDefaultFlightList(){
        defaultFlightList.add("British Airways");

    }
    public List<String> getDefaultFlightList(){
        return defaultFlightList;
    }

    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>();
        for(String s : this.getDefaultFlightList()){

            temp.add(s);
        }
        return new Flight(temp);
    }
}
