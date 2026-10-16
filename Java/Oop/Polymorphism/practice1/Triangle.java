package Oop.Polymorphism.practice1;

public class Triangle implements Shape{
    private double base;
    private double height;
    private String name = "Triangle";

    public String getName() {
        return name;
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }


    @Override
    public double calculateArea() {
        return (base*height)/2;
    }
}