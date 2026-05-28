

import model.*;
import service.ATMSwitch;

public class Main {

    public static void main(String[] args) {

        SavingsAccount account1 = new SavingsAccount(
                "1001",
                "Amen",
                10000,
                "Commercial Bank"
        );

        BusinessAccount account2 = new BusinessAccount(
                "2001",
                "Nathan",
                50000,
                "Dashen Bank"
        );

        ATM cbeATM = new CBEBankATM(
                "ATM-CBE-01",
                "Addis Ababa"
        );

        ATM abyssiniaATM = new AbyssiniaATM(
                "ATM-ABY-01",
                "Bole"
        );

        ATMSwitch switchSystem = new ATMSwitch();

        switchSystem.routeTransaction(
                abyssiniaATM,
                account1,
                2000
        );
        
        switchSystem.validateTransaction(account1, 2000);

        

        account1.checkBalance();

        Transaction transaction = new Transaction(
                "TXN001",
                2000,
                "Withdrawal",
                "Successful"
        );

        transaction.displayTransactionDetails();
    }
}