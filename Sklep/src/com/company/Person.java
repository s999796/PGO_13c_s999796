package com.company;
import java.util.ArrayList;

public class Person {
    private String name;
    private String surname;
    private double moneyInCash;
    private double moneyOnCard;
    private ShoppingCart currentCart;
    private ArrayList<ShoppingCart> orderHistory = new ArrayList<>();

    public Person(String name, String surname, double moneyInCash, double moneyOnCard){
        this.name = name;
        this.surname = surname;
        this.moneyInCash = moneyInCash;
        this.moneyOnCard = moneyOnCard;
        System.out.println("New person: " + this);
    }

    public void makeOrder(){
        this.currentCart = new ShoppingCart();
        System.out.println("New order created by " + this.name);
    }
    public void buyByCard(){
        if (this.currentCart.getTotalPrice() == 0)
            System.out.println(this.name + " cart is empty");
        if (this.moneyOnCard >= this.currentCart.getTotalPrice()){
            System.out.println("Cart paid by card");
            this.currentCart.sell();
            this.orderHistory.add(this.currentCart);
            this.currentCart = null;
        }
        else
            System.out.println(this.name + " doesn't have enough credit");
    }

    public void buyByCash(){
        if (this.currentCart.getTotalPrice() == 0)
            System.out.println(this.name + " cart is empty");
        if (this.moneyInCash >= this.currentCart.getTotalPrice()){
            System.out.println(this.name + " cart paid by cash");
            this.currentCart.sell();
            this.orderHistory.add(this.currentCart);
            this.currentCart = null;
        }
        else
            System.out.println(this.name + " does'nt have enough cash");
    }

    public void addProductToCart(Products product){
        if (product.isAvailable())
            this.currentCart.addProductToCart(product);
        if (product.getDeliveryTime() != 0)
            System.out.println( product.getName() + " will be delivered in " + product.getDeliveryTime() + " days");
    }

    @Override
    public String toString(){
        return "Person: [Name: " + this.name + ", Surname: " + this.surname + "]";
    }
}
