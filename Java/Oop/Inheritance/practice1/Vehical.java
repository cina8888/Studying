package Oop.Inheritance.practice1;

public class Vehical {
    private String brand;
    private String model;
    private int year;

    public Vehical(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }


    public int getYear() {
        return year;
    }


    public void displayInfor() {
        System.out.println(String.format("Brand: %s", this.brand));
        System.out.println(String.format("Brand: %s", this.model));
        System.out.println(String.format("Brand: %d", this.year));
    }
}
