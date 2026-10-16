package Oop.Bank;

public abstract class BankAccount implements WithDraw {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public boolean deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit can not under 0");
        }
        this.balance += amount;
        return true;
    }

    @Override
    public boolean withDraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount can not under 0.");
        } else if (amount > this.balance) {
            throw new IllegalArgumentException("Amount is larger than balance.");
        }
        this.balance -= amount;
        return true;
    }
}