package com.supermarkt;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Supermarkt supermarkt=new Supermarkt();
        ShoppingCart shoppingCart=new ShoppingCart();

        //adding products to shopping cart
        shoppingCart.addToCart(supermarkt.soap);
        shoppingCart.addToCart(supermarkt.cereals);
        shoppingCart.addToCart(supermarkt.chinese);
        shoppingCart.addToCart(supermarkt.yoghurt);
        shoppingCart.addToCart(supermarkt.diaper);

        //removing products from shopping cart
        shoppingCart.removeFromCart(supermarkt.yoghurt);

        //checking out
        shoppingCart.checkOut(17);
    }
}
