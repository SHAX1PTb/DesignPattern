package main.java.Creational.AbstractFactory;

public class Hp extends Laptop {

    private String ramSize;
    private String processorType;

    public Hp(String ramSize, String processorType) {
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    @Override
    public String toString() {
        return "Hp{" +
                "ramSize='" + ramSize + '\'' +
                ", processorType='" + processorType + '\'' +
                '}';
    }

    @Override
    public String getConfiguration() {

        return "This is Hp Class"+ramSize + processorType;
    }
}
