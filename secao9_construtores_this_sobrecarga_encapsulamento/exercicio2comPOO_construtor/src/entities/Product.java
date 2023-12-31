package entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        //return System.out.printf("product data: %s, $%.2f, %d units, total= $%.2f", name, price, quantity, totalValueInStock());
        return  name + ", "
                + "$" + String.format("%.2f", price) + ", "
                + quantity + " units, "
                + "total = $" + String.format("%.2f", totalValueInStock());
    }
}
