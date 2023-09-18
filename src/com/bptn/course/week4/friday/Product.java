package com.bptn.course.week4.friday;

import java.util.ArrayList;
import java.util.List;

public class Product {
    int id;
    String name;
    double price;

    // Constructor to initialize the product properties
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Return count of products with price less than 30000
    public static long countProducts(List<Product> productsList)
    {
        long count = productsList.stream()
                                 .filter(product -> product.price < 30000)
                                 .count();
        return count;
    }

    public static void main(String[] args) {
        // Create a list of products
        List<Product> productsList = new ArrayList<Product>();

        // Adding products to the list
        productsList.add(new Product(1, "HP Laptop", 25000));
        productsList.add(new Product(2, "Dell Laptop", 30000));
        productsList.add(new Product(3, "Lenevo Laptop", 28000));
        productsList.add(new Product(4, "Sony Laptop", 28000));
        productsList.add(new Product(5, "Apple Laptop", 90000));

        long count = countProducts(productsList);
        
        // Print the count of products whose price is less than 30000
        System.out.println("Number of products with price less than 30000: " + count);
    }
}
