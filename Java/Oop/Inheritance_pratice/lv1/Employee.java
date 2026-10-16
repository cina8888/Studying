package Oop.Inheritance_pratice.lv1;

public abstract class Employee {
    protected String name;
    protected int id;
    protected double baseSalary;

    Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public void displayInfo() {
        System.out.print(name + " " + id + " " + baseSalary);
    }

    abstract double calculateSalary();
}
