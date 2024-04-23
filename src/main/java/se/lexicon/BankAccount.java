package se.lexicon;

public class BankAccount {
    private static int nextAccountNumber = 1000; // Starting account number
    private final int accountNumber;
    private double balance;

    public BankAccount(double initialBalance) {
        this.accountNumber = nextAccountNumber++;
        this.balance = initialBalance;
    }


    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully into account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {

        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully from account " + accountNumber);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}