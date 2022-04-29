package com.company;

import java.util.ArrayList;

public class ShoppingCart {
    private int id;
    private int idCounter = 1;
    private ArrayList<Products> products = new ArrayList<>();

    public ShoppingCart(){
        this.id = idCounter++;
    }

    public double getTotalPrice(){
        double totalPrice = 0;
        for (Products p : products)
            totalPrice += p.getPrice();

        return totalPrice;
    }

    public double getTotalDeliveryTime(){
        double totalDeliveryTime = 0;
        for (Products p : products)
            totalDeliveryTime += p.getDeliveryTime();

        return totalDeliveryTime;
    }

    public void addProductToCart(Products product){
        if (product.isAvailable()) {
            this.products.add(product);
            System.out.println(product.getName() + " added to cart");
        }
        else
            System.out.println( product.getName() + " currently not available");
    }

    public void sell(){
        for (Products p : products)
            p.sell();
    }

}
