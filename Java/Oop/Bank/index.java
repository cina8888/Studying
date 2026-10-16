package Oop.Bank;

public class index {
    public static void main(String[] args) {
        BankManager myBank = new BankManager();
        BankAccount[] list = {new CheckingAccount("1111", "Nguyen Van A", 5000, 1000), 
                            new SavingAccount("1112", "Nguyen Van B", 6000, 0.2)};
        
        for (BankAccount acc : list) {
            myBank.addAccount(acc);
        }

        BankAccount acc = myBank.findAccount("1112");

        acc.deposit(10000);

        myBank.displayInterest("1112");

        myBank.displayAccount();
    }
}