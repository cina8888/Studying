package UMLdiagram.Practice2_Bank;

public interface Account {
    String getId();
    double getBalance();

    void withdraw(double amount);
    void deposit(double amount);
    void applyFees();
    void applyInterest();   
}