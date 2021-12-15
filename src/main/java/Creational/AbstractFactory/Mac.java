package main.java.Creational.AbstractFactory;

public class Mac extends Laptop {

    private String ramSize;
    private String processorType;

    public Mac(String ramSize, String processorType) {
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    @Override
    public String toString() {
        return "Mac{" +
                "ramSize='" + ramSize + '\'' +
                ", processorType='" + processorType + '\'' +
                '}';
    }

    @Override
    public String getConfiguration() {

        return "This is Mac Class"+ramSize + processorType;
    }
}
