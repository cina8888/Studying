package Oop.Bank;

public class CheckingAccount extends BankAccount {
    private double overdraftlimit;

    public CheckingAccount(String accountNumber, String ownerName, double balance, double overdraftlimit) {
        super(accountNumber, ownerName, balance);
        this.overdraftlimit = overdraftlimit;
    }

    @Override
    public boolean withDraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount is invalid!");
        }
        double maxWithDraw = getBalance() + this.overdraftlimit;
        if (amount > maxWithDraw) {
            throw new IllegalArgumentException("Withdraw is larger than allowance!");
        }
        setBalance(getBalance() - amount);
        return true;
    }    
}