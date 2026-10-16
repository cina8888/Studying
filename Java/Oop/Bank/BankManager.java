package Oop.Bank;
import java.util.List;
import java.util.ArrayList;


public class BankManager {
    private List<BankAccount> accountsManager;

    public BankManager() {
        this.accountsManager = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        if (account != null) {
            accountsManager.add(account);
        }   else {
            System.out.println("Lỗi: Không thể thêm tài khoản rỗng (null).");
        }
    }

    public BankAccount findAccount(String accountNumber) {
        BankAccount result = accountsManager.get(0);
        for (BankAccount r : accountsManager) {
            if (r.getAccountNumber().equals(accountNumber)) {
                result = r;
            }
        }
        return result;
    }

    public void displayInterest(String accountNumber) {
        BankAccount acc = findAccount(accountNumber);

        if (acc instanceof SavingAccount) {
            SavingAccount savingAcc = (SavingAccount) acc;
            double interestAcc = savingAcc.calInterest();
            System.out.println(String.format("Interest for %s is %.2f", accountNumber, interestAcc));
        }   else {
            System.out.println("Error: Account " + accountNumber + " is not Saving Account!");
        }
    }

    public void displayAccount() {
        System.out.println("--- Account Lists ---");
        if(accountsManager.isEmpty()) {
            System.out.println("Bank dont have any accounts.");
            return;
        }
        for(BankAccount acc: accountsManager) {
            System.out.println("Account Number: " + acc.getAccountNumber() + 
                               " | Account Name: " + acc.getOwnerName() + 
                               " | Balance: " + acc.getBalance());
        }
        System.out.println("-------------------------------------");
    }
}
