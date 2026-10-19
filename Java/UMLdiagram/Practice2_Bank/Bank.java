package UMLdiagram.Practice2_Bank;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, Customer> customers = new HashMap<>();
    public Bank(){}

    public void addCustomer(Customer customer) {
        if (customer != null) {
            customers.put(customer.getCustomerID(), customer);
            System.out.println("Đã thêm khách hàng: " + customer.getName() + " (ID: " + customer.getCustomerID() + ")");
        }
    }

    public void removeCustomer(Customer customer) {
        if (customer != null && customers.containsKey(customer.getCustomerID())) {
            customers.remove(customer.getCustomerID());
            System.out.println("Đã xóa khách hàng: " + customer.getName() + " khỏi hệ thống.");
        } else {
            System.out.println("Không tìm thấy khách hàng này trong hệ thống!");
        }
    }

    public void listAllAccount() {
        if (customers.isEmpty()) {
            System.out.println("Ngân hàng hiện chưa có khách hàng nào.");
            return;
        }
        // Duyệt qua từng khách hàng và gọi listAccount() của họ
        for (Customer c : customers.values()) {
            System.out.println("Khách hàng: " + c.getName());
            c.listAccount(); 
        }
    }
}
