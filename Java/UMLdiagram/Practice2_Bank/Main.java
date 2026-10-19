package UMLdiagram.Practice2_Bank;

public class Main {
    public static void main(String[] args) {
        Bank tpBank = new Bank();

        Customer c1 = new Customer("Nguyen Van A", "01/01/1990", "CUST001");
        Customer c2 = new Customer("Tran Thi B", "15/05/1995", "CUST002");

        tpBank.addCustomer(c1);
        tpBank.addCustomer(c2);

        SavingAccount savingAcc1 = new SavingAccount(1000.0, "SAV-1");
        SavingAccount savingAcc2 = new SavingAccount(1100.0, "SAV-2");

        c1.addAccount(savingAcc1);
        c2.addAccount(savingAcc2);
        tpBank.listAllAccount();
    }
}
