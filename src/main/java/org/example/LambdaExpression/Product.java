package org.example.LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product{
        int id;
        String name;

        public Product(int id, String name) {
            super();
            this.id = id;
            this.name = name;
        }
    }
    class LambdaExpressionExample2{
        public static void main(String[] args) {
            List<Product> list=new ArrayList<Product>();

            list.add(new Product(1,"Dell Mouse"));
            list.add(new Product(3,"Mouse"));
            list.add(new Product(2,"HP Laptop"));

            System.out.println("Sorting on the basis of name...");
            Collections.sort(list,(p1, p2)->{
                return p1.name.compareTo(p2.name);
            });
            for(Product p:list){
                System.out.println(p.id+" "+p.name);
            }

        }
    }

