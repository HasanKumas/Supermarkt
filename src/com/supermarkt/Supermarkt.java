package com.supermarkt;

import java.util.ArrayList;
import java.util.List;

public class Supermarkt {
    public Product soap;
    public Product cereals;
    public Product chinese;
    public Product yoghurt;
    public Product diaper;

    public Supermarkt() {
        soap = new Product("Soap", 300);
        cereals = new Product("Cereal", 250);
        chinese = new Product("Chinese vegetables", 500);
        yoghurt = new Product("Yoghurt", 200);
        diaper = new Product("Diaper", 1000);
    }
}
