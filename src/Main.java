

import models.*;

public class Main {

    public static void main(String[] args) {

        SavingsAccount savings =
                new SavingsAccount("Rahul", 101, 10000, 5);

        CurrentAccount current =
                new CurrentAccount("Arun", 102, 15000, 5000);

        // Deposit
        savings.deposit(2000);
        current.deposit(3000);

        // Withdraw
        savings.withdraw(1000);
        current.withdraw(18000);

        // Display accounts
        System.out.println("\n--- Savings Account ---");
        savings.displayaccount();

        System.out.println("\n--- Current Account ---");
        current.displayaccount();

        // Polymorphism
        System.out.println("\n--- Polymorphism ---");

        BankAccount account1 = new SavingsAccount(
                "John", 103, 10000, 5
        );

        BankAccount account2 = new CurrentAccount(
                "Alex", 104, 10000, 3000
        );

        account1.calculateInterest();
        account2.calculateInterest();

        // Display after interest
        System.out.println("\n--- After Interest ---");
        account1.displayaccount();
        account2.displayaccount();
    }
}