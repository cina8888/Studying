package Oop.Encapsulation.practice2;

public class Product {
    private String id;
    private String name;
    private double price;
    private int quantity;

    public Product(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    public void updatePrice(double newPrice) {
        if (newPrice < 0) {
            throw new IllegalArgumentException("New price is invalid!");
        }
        this.price = newPrice;
    }

    public void sell(int amount) {
        if (amount > this.quantity) {
            throw new IllegalArgumentException("Selling is more than in iventory!");
        }
        this.quantity -= amount;
    }

    public void restock(int amount) {
        this.quantity += amount;
    }

    public double calculateTotalValue() {
        double TotalValue = this.quantity * this.price;
        return TotalValue;
    }

    public String displayInfo() {
        return String.format("Id: %s\nName Product: %s\nPrice: %.2f\nQuantity: %d", this.id, this.name, this.price, this.quantity);
    }
}
