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
    public static void main(String[] args) {
        CBEBankATM cbe = new CBEBankATM("212", "bole");
        Account acc = new Account("201", "abdi", 1000, "CBE BANK");
        cbe.processWithdrawal(acc, 300
        );
        
    }
}
