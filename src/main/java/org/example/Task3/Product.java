package org.example.Task3;

public class Product {
    private String name;
    private Money price;

    public Product(String name, Money price) {
        this.name = name;
        this.price = price;
    }

    public void reducePrice(int amount) {
        int totalCents = this.price.getDollars() * 100 + this.price.getCents();
        totalCents -= amount;
        this.price.setDollars(totalCents / 100);
        this.price.setCents(totalCents % 100);
    }

    public void display() {
        System.out.print("Product: " + name + ", Price: ");
        this.price.display();
    }
}
