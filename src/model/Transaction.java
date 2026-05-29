package model;

public class Transaction {

    private String transactionId;
    private double amount;
    private String transactionType;

    public Transaction(String transactionId,
                       double amount,
                       String transactionType){

        this.transactionId = transactionId;
        this.amount = amount;
        this.transactionType = transactionType;
    }

    public void displayTransactionDetails(Account acc){

        System.out.println("\n===== TRANSACTION DETAILS =====");

        System.out.println("Transaction ID: " + transactionId);

        System.out.println("Amount: " + amount);

        System.out.println("Type: " + transactionType);

        if(acc.getTransactionSuccess()){

            System.out.println("Status: Successful");

        }else{

            System.out.println("Status: Failed");
        }
    }
}