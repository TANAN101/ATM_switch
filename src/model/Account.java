package model;

public class Account {

    private String accountNumber;
    private String ownerName;
    protected double Balance;
    private String bankName;

    protected boolean transactionSuccess;

    public Account(String accountNumber,
                   String ownerName,
                   double Balance,
                   String bankName){

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

    public boolean getTransactionSuccess(){
        return transactionSuccess;
    }

    // NORMAL WITHDRAW
    public void withdraw(double amount){

        if(amount > 0 && Balance - amount >= 100){

            Balance -= amount;

            transactionSuccess = true;

            System.out.println("Withdrawal successful.");

        }else{

            transactionSuccess = false;

            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // OVERLOADED WITHDRAW
    public void withdraw(double amount, double fee){

        double total = amount + fee;

        if(total > 0 && Balance - total >= 100){

            Balance -= total;

            transactionSuccess = true;

            System.out.println("Withdrawal successful with fee.");

        }else{

            transactionSuccess = false;

            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void checkBalance(){

        System.out.println("Current Balance: " + Balance + " birr");
    }
}