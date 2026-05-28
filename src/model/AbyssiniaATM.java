package model;

public class AbyssiniaATM extends ATM {

    public AbyssiniaATM(String atmId, String location) {
        super(atmId, "Abyssinia Bank", location);
    }

    public void processWithdrawal(Account account, double amount) {

        System.out.println("Abyssinia ATM Processing...");

        double fee = 15;

        account.withdraw(amount, fee);
        
        System.out.println("Abyssinia ATM fee charged: " + fee);
    }
    
    }
