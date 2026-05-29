package model;

public class SavingsAccount extends Account {

    public SavingsAccount(String accountnumber,
                          String ownerName,
                          double Balance,
                          String bankName){

        super(accountnumber, ownerName, Balance, bankName);
    }

    @Override
    public void withdraw(double amount, double fee){

        if(amount > 5000){

            transactionSuccess = false;

            System.out.println("Withdraw Limit for Savings is 5000!");

        }else{

            super.withdraw(amount, fee);
        }
    }
}