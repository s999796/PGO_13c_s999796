package com.company;

import java.util.ArrayList;

public class Shop {

    public static void main(String[] args) {
            Storage s1 = new Storage(1);
            Storage s2 = new Storage(2);
            Storage s3 = new Storage(5);
            Person p1 = new Person("Joanna", "Sikorska", 1222.33, 666.66);
            Person p2 = new Person("Bartosz", "Kawa", 0, 0);
            Person p3 = new Person("Anna", "Geslica", 123.123, 321.321);
            Products pr1 = new Products("Fish", ProductType.CONSUMABLE, 10.0, 100, s1);
            Products pr2 = new Products("Book", ProductType.ENTERTAINMENT, 50.0, 0, s2);
            Products pr3 = new Products("IPhone", ProductType.ELECTRONIC, 3000.0, 3, s3);

            p2.makeOrder();
            p2.addProductToCart(pr3);
            p2.buyByCard();

            System.out.println("\nQuantity of books before: " + pr2.getQuantity());
        System.out.println("Quantity of Fish before: " + pr1.getQuantity());
            p1.makeOrder();
            p1.addProductToCart(pr2);
            p1.addProductToCart(pr1);
            p1.buyByCash();
            System.out.println("Quantity of books after: " + pr2.getQuantity());
            System.out.println("Quantity of fish after: " + pr1.getQuantity());
    }
}
