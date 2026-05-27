package model;

public class CBEBankATM extends ATM {

    public CBEBankATM(String atmId, String location) {
        super(atmId, "Commercial Bank of Ethiopia", location);
    }

    public void processWithdrawal(Account account, double amount) {

        System.out.println("CBE ATM Processing...");

        double fee = 10;

        account.withdraw(amount, fee);

        System.out.println("CBE ATM fee charged: " + fee);
    }
}
