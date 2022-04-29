package com.company;
public class Products {
    private String name;
    private ProductType type;
    private double price;
    private int quantity;
    private int deliveryTime;
    private Storage storage;

    public Products(String name, ProductType type, double price, int quantity, Storage storage){
        this.name = name;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
        this.storage = storage;
        setDeliveryTime();
        System.out.println("New product: " + this);
    }

    public double getPrice(){
        return this.price;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public String getName(){
        return this.name;
    }

    public boolean isAvailable(){
        if (this.quantity <= 0){
            return false;
        }
        else
            return true;
    }

    public void setDeliveryTime(){
        if (this.quantity != 0)
            this.deliveryTime = 0;
        else
            this.deliveryTime = this.storage.getDeliveryTime();
    }

    public int getDeliveryTime(){
        return deliveryTime;
    }

    public void sell(){
        this.quantity--;
    }
    @Override
    public String toString(){
        return "Product: [Name: " + this.name + "]";
    }

}

enum ProductType{
    CONSUMABLE, ENTERTAINMENT, ELECTRONIC;
}
