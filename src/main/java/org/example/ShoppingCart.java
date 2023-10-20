package org.example;

import java.util.*;

public class ShoppingCart {
    private ArrayList<Product> items;

    public ShoppingCart(ArrayList<Product>items) {
        this.items = items;
    }

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public double getBalance() {
        double balance = 0.00;
        for (Iterator i = items.iterator(); i.hasNext();){
            Product item = (Product)i.next();
            balance += item.getPrice();
        }
        return balance;
    }

    public void addItem(Product item) {
        items.add(item);
    }

    public void removeItem(Product item)
            throws ProductNotFoundException {
        if (!items.remove(item)) {
            throw new ProductNotFoundException();}
    }

    public int getItemCount() {
        return items.size();
    }

    public ShoppingCart empty() {
        items.clear();
        return this;
    }
}