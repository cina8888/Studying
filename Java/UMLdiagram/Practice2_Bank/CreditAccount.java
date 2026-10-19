package UMLdiagram.Practice2_Bank;

public class CreditAccount extends AbstractAccount {
    private final double CREDIT_LIMIT = 5000.0;
    public CreditAccount(double balance, String id) {
        super(balance, id);
    }
    
    @Override
    public void withdraw(double amount) {
        if(amount > getBalance() + CREDIT_LIMIT) {
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
    public void applyInterest() {}
}
