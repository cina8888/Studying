package Oop.Encapsulation.practice1;

public class index {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("10001", "Nguyen Van A", 1000000.0);
        account1.deposit(102021.123);
        account1.withdraw(110000);
        account1.displayInfo();
    }
}
