package UMLdiagram.Practice2_Bank;

public class Person {
    private String name;
    private String dob;
    private String customerID;

    public Person(String name, String dob, String customerID) {
        this.name = name;
        this.dob = dob;
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getCustomerID() {
        return customerID;
    }
}
