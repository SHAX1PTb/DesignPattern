package Structural.Adapter;

public class TaxiDriver implements Driver {
    private String carNo;
    private Integer liscenceNo;
    private BankAccount bankAccount;

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public Integer getLiscenceNo() {
        return liscenceNo;
    }

    public void setLiscenceNo(Integer liscenceNo) {
        this.liscenceNo = liscenceNo;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getTaxiNo() {
        return null;
    }

    @Override
    public BankAccount getBankAccount() {
        return null;
    }
}
