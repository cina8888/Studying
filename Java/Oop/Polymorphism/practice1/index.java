package Oop.Polymorphism.practice1;

public class index {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5),
            new Rectangle(4, 6),
            new Triangle(3, 8)
        };

        for (Shape shape : shapes) {
            System.out.println(String.format("Name of Shape: %s | Area: %.2f", shape.getName(), shape.calculateArea()));
        }  
    }
}
