package model;

public class SavingsAccount extends Account {
    public SavingsAccount(String accountnumber, String ownerName, double Balance, String bankName){
        super(accountnumber, ownerName, Balance, bankName);

    }
    @Override
    public void withdraw(double amount){
        if (amount > 5000){
            System.out.println("Withdraw Limit for Savings is 5000!");
        } else{
            super.withdraw(amount);
        }
    }

}







