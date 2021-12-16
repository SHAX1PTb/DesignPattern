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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getTaxiNo() {
        return taxiNo;
    }

    public void setTaxiNo(String taxiNo) {
        this.taxiNo = taxiNo;
    }
}
