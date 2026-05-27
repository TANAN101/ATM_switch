package model;

public class Account {
    private String accountNumber;
    private String ownerName;
    private double Balance;
    private String bankName;

    public Account(String accountNumber, String ownerName, double Balance, String bankName){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.Balance = Balance;
        this.bankName = bankName;
    }
    public String getaccountNumber(){
        return accountNumber;
    }
    public String getownerName(){
        return ownerName;
    }
    public double getBalance(){
        return Balance;
    }
    public String getbankName(){
        return bankName;
    }

    
}
