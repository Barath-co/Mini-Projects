package models;

public class CurrentAccount extends BankAccount {
    private double overdraftlimit;

    public CurrentAccount(String holdername, int accountnumber, double balance, double overdraftlimit) {
        super(holdername, accountnumber, balance);
        this.overdraftlimit = overdraftlimit;
    }

    @Override
    public void withdraw(int amount) {
        double currentBalance = super.getbalance();

        if (amount > (currentBalance + overdraftlimit)) {
            System.out.println("Transaction denied: Overdraft limit exceeded.");
        } else {
            double newBalance = currentBalance - amount;
            super.setter(newBalance);
            System.out.println("Withdrew: $" + amount + ". New Balance: $" + newBalance);
        }
    }
    @Override
    public void calculateInterest() {
        System.out.println("Current account has no interest");
    }
}
