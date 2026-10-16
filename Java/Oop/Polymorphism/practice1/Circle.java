package Oop.Polymorphism.practice1;

public class Circle implements Shape{
    private double r;
    private String name = "Circle";

    @Override
    public String getName() {
        return name;
    }


    public Circle(double r) {
        this.r = r;
    }


    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(r, 2);
    }
}