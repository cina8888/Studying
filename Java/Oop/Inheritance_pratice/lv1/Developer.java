package Oop.Inheritance_pratice.lv1;

public class Developer extends Employee {
    double bonus;
    
    Developer(String name, int id, double baseSalary, double bonus) {
        super(name, id, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        double salary = baseSalary + bonus;
        return salary;
    }
}
