package org.example.JavaCollectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product4{
    int id;
    String name;
    float price;

    public Product4(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }
}
public class CountMethod {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        Long noOfElements = productsList.stream()
                .collect(Collectors.counting());
        System.out.println("Total elements : " + noOfElements);
    }
}