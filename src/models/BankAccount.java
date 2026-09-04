package models;

public class BankAccount implements Transactions{
    private String holdername;
    private int accountnumber;
    private double balance;

    public BankAccount(String holdername,int accountnumber,double balance){
        this.holdername=holdername;
        this.accountnumber=accountnumber;
        this.balance=balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }
        else{
            System.out.println("Invalid amount entered");
        }
    }

    public void withdraw(int amount){
        if(amount>balance || amount<0){
            System.out.println("Invalid amount entered");
        }
        else{
            balance-=amount;
        }
    }

    public double getbalance(){
        return balance;
    }

    public void displayaccount(){
        System.out.println("THe accountholder is "+holdername
        +"\nThe accountnumber is "+accountnumber
        +"\nThe balance is "+balance);
    }
    public void setter(double amount){
        balance+=amount;
    }
    public void calculateInterest() {
        System.out.println("No interest for normal account");
    }





}