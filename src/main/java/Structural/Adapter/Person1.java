package main.java.Structural.Adapter;

public class Person1 {
    private String name;
    private String bankAccount;
    private String taxiNo;

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", bankAccount='" + bankAccount + '\'' +
                ", taxiNo='" + taxiNo + '\'' +
                '}';
    }
}
