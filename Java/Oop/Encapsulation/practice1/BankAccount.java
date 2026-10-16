package Oop.Encapsulation.practice1;

public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit amount cannot lower than 0!");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if(amount > this.balance) {
            throw new IllegalArgumentException("Withdraw is larger than balance!");
        }
        this.balance -= amount;
    }

    public void displayInfo() {
        System.out.println(String.format("Account: %s\nOwner: %s\nBalance: %.1f", 
                                            accountNumber, ownerName, balance));
    }
}
