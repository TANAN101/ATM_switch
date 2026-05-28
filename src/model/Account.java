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
    public void setownerName(String ownerName){
        this.ownerName = ownerName;
    }
    public void setbankName(String bankName){
        this.bankName = bankName;
    }
    //withdrawal
    public void withdraw(double amount){
         
        if (amount > 0 && Balance - amount >= 100){
            Balance = Balance - amount;
            System.out.println("Withdrawal successful.");
        }else{
            System.out.println("Insufficient balance or invalid amount.");
        }

    }
    public void withdraw(double amount, double fee){
        double total = amount + fee;

        if (total < Balance && Balance - total >= 100 ){
            Balance = Balance - total;
            System.out.println("Withdrawal successful with fee.");
        }else{
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    //checking balance
    public void checkBalance(){
        System.out.println("Current Balance: " + Balance + " birr");
    }
    
}
