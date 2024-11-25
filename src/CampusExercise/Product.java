package CampusExercise;

import java.text.NumberFormat;
import java.util.Scanner;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public static void doWork() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Product Name: ");
        String name =  scanner.nextLine();

        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Price: ");
        double price = scanner.nextDouble();

        Product product = new Product(name, price, quantity);
        double cost = product.calculateCost();
        System.out.println("Cost: " + NumberFormat.getCurrencyInstance().format(cost));

        double tax = product.calculateTax(.023);
        System.out.println("Tax: " + NumberFormat.getCurrencyInstance().format(tax));
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public double calculateCost() {
        return quantity * price;
    }

    public double calculateTax(final double taxRate) {
        return taxRate * quantity * price;
    }
}
