package model;

public class BusinessAccount extends Account {
    public BusinessAccount (String accountNumber, String ownerName, double Balance, String bankName){
        super(accountNumber, ownerName, Balance, bankName);


    }
    @Override
    public void withdraw(double amount, double fee){
         
        if (amount > 20000){
            System.out.println("Business Account withdrawal limit is 20000.");
        }else{
            super.withdraw(amount, fee); 
        }
}
}
