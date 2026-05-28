import model.*;
import service.ATMswitch;

public class Main {

    public static void main(String[] args) {

        SavingsAccount account1 = new SavingsAccount(
                "1001",
                "Amen",
                1000,
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
        ATMswitch switchSystem = new ATMswitch();
        
        switchSystem.routeTransaction(
                abyssiniaATM,
                account1,
                2000
        );

        switchSystem.validateTransaction(account1, 200);

        

        account1.checkBalance();

        Transaction transaction = new Transaction(
                "TXN001",
                200,
                "Withdrawal"
                
        );
        

        transaction.displayTransactionDetails();
        transaction.checkstatus(account1, 200);
        
    }
}

