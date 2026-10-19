package UMLdiagram.Practice2_Bank;

public class SavingAccount extends AbstractAccount {
    private final double interest = 0.05;

    public SavingAccount(double balance, String id) {
        super(balance, id);
    }
    
    @Override
    public void withdraw(double amount) {
        if(amount > getBalance()) {
            throw new IllegalArgumentException("Amount withdraw larger than balance!");
        }
        setBalance(getBalance() - amount);
    }

    @Override
    public void deposit(double amount) {
        if(amount < 0) {
            throw new IllegalArgumentException("Amount deposit need to larger than 0.");
        }
        setBalance(getBalance() + amount);
    }

    @Override
    public void applyInterest() {
        double interestAmount = getBalance() * interest;
        setBalance(interestAmount + getBalance());
    }
}