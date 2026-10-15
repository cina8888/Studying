package Inheritance.lv1;

public class index {
    public static void main(String[] args) {
        Developer developer1 = new Developer("Nghia", 1, 10000.10, 1000.100);
        Employee manager1 = new Manager("Kaa", 0, 1200.30, 100);
        developer1.displayInfo();
        manager1.displayInfo();
        System.out.println(developer1.calculateSalary());
        System.out.println(manager1.calculateSalary());
    }
}
