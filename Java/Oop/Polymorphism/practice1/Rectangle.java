package Oop.Polymorphism.practice1;

public class Rectangle implements Shape{
    private double width;
    private double height;
    private String name = "Rectangle";


    public String getName() {
        return name;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public double calculateArea() {
        return width * height;
    }
}