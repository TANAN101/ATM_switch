

import java.util.Scanner;

import model.*;
import service.ATMswitch;

public class Main {

    public static void main(String[] args) {

        Scanner take = new Scanner(System.in);

        System.out.println("===== ATM SWITCH SYSTEM =====");

        System.out.println("Choose Account Type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Business Account");

        int choice = take.nextInt();

        Account account;

        if(choice == 1){

            account = new SavingsAccount(
                    "1001",
                    "Amen",
                    10000,
                    "Commercial Bank"
            );

        }else{

            account = new BusinessAccount(
                    "2001",
                    "TANAN",
                    50000,
                    "Dashen Bank"
            );
        }

        ATM abyssiniaATM = new AbyssiniaATM(
                "ATM-ABY-01",
                "Bole"
        );

        System.out.print("Enter withdrawal amount: ");

        double amount = take.nextDouble();

        ATMswitch switchSystem = new ATMswitch();

        switchSystem.validateTransaction(account, amount);

        switchSystem.routeTransaction(
                abyssiniaATM,
                account,
                amount
        );

        account.checkBalance();

        Transaction transaction = new Transaction(
                "TXN001",
                amount,
                "Withdrawal"
        );

        transaction.displayTransactionDetails(account);

        take.close();
    }
}