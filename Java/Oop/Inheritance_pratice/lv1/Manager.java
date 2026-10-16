package Oop.Inheritance_pratice.lv1;

public class Manager extends Employee {
    double allowance;
    
    Manager(String name, int id, double baseSalary, double allowance) {
        super(name, id, baseSalary);
        this.allowance = allowance;
    }

    @Override
    public double calculateSalary() {
        double salary = baseSalary + allowance;
        return salary;
    }
}
