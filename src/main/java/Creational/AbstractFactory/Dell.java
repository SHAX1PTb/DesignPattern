package Creational.AbstractFactory;

public class Dell extends Laptop {

    private String ramSize;
    private String processorType;

    public Dell(String ramSize, String processorType) {
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    @Override
    public String toString() {
        return "Dell{" +
                "ramSize='" + ramSize + '\'' +
                ", processorType='" + processorType + '\'' +
                '}';
    }

    @Override
    public String getConfiguration() {

        return "This is Dell Class"+ramSize + processorType;
    }
}
