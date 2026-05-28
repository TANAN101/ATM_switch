package service;
import model.Account;
import model.ATM;
public class ATMswitch {
    public void validateTransaction(Account acc, double amount){
        if (amount <= acc.getBalance()){
            System.out.println("Transaction validated by ATMSwitch.");
        } else{
            System.out.println("Transaction failed: insufficient balance.");
        }
    }
    public void routeTransaction(ATM atm, Account acc, double amount){
        System.out.println("Routing transaction through ATMSwitch...");
        atm.processWithdrawal(acc, amount);
        atm.printReceipt();
    }
    
}
