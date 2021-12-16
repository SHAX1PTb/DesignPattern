package main.java.Structural.Adapter;

public class BankAccount {
    private String acctNo;
    private String bankName;
    private String IFSCCode;

    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getIFSCCode() {
        return IFSCCode;
    }

    public void setIFSCCode(String IFSCCode) {
        this.IFSCCode = IFSCCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "acctNo='" + acctNo + '\'' +
                ", bankName='" + bankName + '\'' +
                ", IFSCCode='" + IFSCCode + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }

    private String cityName;
}
