package model;


public class Transaction {

    private String transactionId;
    private double amount;
    private String transactionType;
    private String status = "Status: Successful"; 

    public Transaction(String transactionId, double amount,
                       String transactionType) {

        this.transactionId = transactionId;
        this.amount = amount;
        this.transactionType = transactionType;
        
        
        
    }

    
    public void displayTransactionDetails() {

        System.out.println("===== TRANSACTION DETAILS =====");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Amount: " + amount);
        System.out.println("Type: " + transactionType);
        
    }
    public void checkstatus(Account acc, double amount){
          if (acc.getBalance() - amount > 100 ){
           System.out.println(status);
            
        }else{
            System.out.println("Status: Unsuccessful");
        }
    } 
}