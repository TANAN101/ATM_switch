package model;

public class ATM {

    protected String atmId;
    protected String bankName;
    protected String location;

    public ATM(String atmId,
               String bankName,
               String location){

        this.atmId = atmId;
        this.bankName = bankName;
        this.location = location;
    }

    public void processWithdrawal(Account account,
                                  double amount){

        System.out.println("Processing withdrawal from ATM...");

        account.withdraw(amount);
    }

    public void printReceipt(){

        System.out.println("Transaction completed.");
    }
}