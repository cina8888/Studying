package Oop.Inheritance.practice1;

public class Car extends Vehical {
    private int numberOfSeats;

    public Car(String brand, String model, int year, int numberOfSeats) {
        super(brand, model, year);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void displayInfor() {
        super.displayInfor();
        System.out.println(String.format("Number of Seats: %d", this.numberOfSeats));
    }
}
