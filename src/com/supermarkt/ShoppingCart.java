package com.supermarkt;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Product> productsInCart=new ArrayList<>();

    //adds products to shopping cart
    public void addToCart(Product product){
        productsInCart.add(product);

    }
    //removes products from the shopping cart
    public  void removeFromCart(Product product){
        productsInCart.remove(product);

    }

    /**
     * check out at the cash register
     * calculates the change and show it
     * calculate the discount and show it
     */
    public void checkOut(int payment){
        int total=0;
        int discount=0;
        int netTotal=0;
        payment *=100;
        System.out.println("Your shopping cart includes the following products: ");
        for (Product product: productsInCart) {
            System.out.println(product.getProductName()+ ", "+ product.getPrice()/100+ " euros " + product.getPrice()%100+ " cents.");
            total +=(product.getPrice());

        }
        System.out.println("The total amount without discount: "+ total/100 + " euros " + total%100 + " cents ");
        if(total>2000){
           discount=100;

        }else if(total>1000){
            discount= 50;
        }
        netTotal=total-discount;
        System.out.println("The total amount with discount: "+ netTotal/100+ " euros "+ netTotal%100+ " cents ");
        int payBack=0;
        if (payment>=netTotal){
            payBack=payment-netTotal;
            System.out.println("You get "+ (payBack/100)+ " euros, "+ (payBack%100)+ " cents back.");
        }
        else{
            payBack=netTotal-payment;
            System.out.println("You should pay "+ (payBack/100)+ " euros, "+ (payBack%100)+ " cents more.");
        }
    }
}
