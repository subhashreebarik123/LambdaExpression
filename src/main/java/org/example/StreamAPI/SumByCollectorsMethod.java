package org.example.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product3{
    int id;
    String name;
    float price;

    public Product3(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class SumByCollectorsMethod {
    public static void main(String[] args) {

        List<Product> productsList = new ArrayList<Product>();

        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        // Using Collectors's method to sum the prices.
          double totalPrice3 = productsList.stream()
                  .collect(Collectors.summingDouble(product->product.price));
          System.out.println(totalPrice3);


    }
}
