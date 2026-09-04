package models;

public class SavingsAccount extends BankAccount{
    private double interestrate;

    public SavingsAccount(String holdername, int accountnumber, double balance, double interestrate){
        super(holdername,accountnumber,balance);
        this.interestrate=interestrate;

    }
    @Override
    public void calculateInterest() {
        double interest = getbalance() * interestrate / 100;
        deposit(interest);
        System.out.println("Interest added: " + interest);
    }

}