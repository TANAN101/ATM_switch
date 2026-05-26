package model;

public class ATM {

    protected String atmId;
    protected String bankName;
    protected String location;

    public ATM(String atmId, String bankName, String location) {
        this.atmId = atmId;
        this.bankName = bankName;
        this.location = location;
    }
}