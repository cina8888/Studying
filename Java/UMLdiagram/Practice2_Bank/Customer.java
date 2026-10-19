package UMLdiagram.Practice2_Bank;
import java.util.HashMap;
import java.util.Map;

public class Customer extends Person {
    private Map<String, Account> accounts = new HashMap<String, Account>();

    public Customer(String name, String dob, String customerID) {
        super(name, dob, customerID);
    }

    public void addAccount(Account account) {
        accounts.put(account.getId(), account);
        System.out.println("Account added: " + account.getId());
    }

    public void removeAccount(Account account) {
        accounts.remove(account.getId());
        System.out.println("Account removed: " + account.getId());
    }

    public void listAccount() {
        System.out.println("--- Account listing of customer ---");
        if(accounts.isEmpty()) {
                System.out.println("This customer dont have any account.");
                return;
            }
        for(Account acc: accounts.values()) {
            System.out.println("- ID: " + acc.getId() + " | Số dư: $" + acc.getBalance());
        }
    }
}
