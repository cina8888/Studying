package UMLdiagram.Practice2_Bank;

public abstract class AbstractAccount implements Account {
    private double balance;
    private String id;

    public AbstractAccount(double balance, String id) {
        this.balance = balance;
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getId() {
        return id;
    }

    @Override
    public void applyFees() {
        double commonFee = 2.0;
        if (balance >= commonFee) {
            balance -= commonFee;
            System.out.println("Đã trừ phí cơ bản: $" + commonFee);
        }
    }   

    @Override
    public String toString() {
        return "AbstractAccount [balance=" + balance + ", id=" + id + "]";
    }
}