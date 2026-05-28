package model;

public class Transaction {

    private String transactionId;
    private double amount;
    private String transactionType;
    private String status;

    public Transaction(String transactionId, double amount,
                       String transactionType, String status) {

        this.transactionId = transactionId;
        this.amount = amount;
        this.transactionType = transactionType;
        this.status = status;
    }

    public void displayTransactionDetails() {

        System.out.println("===== TRANSACTION DETAILS =====");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Amount: " + amount);
        System.out.println("Type: " + transactionType);
        System.out.println("Status: " + status);
    }
}