package org.example.LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {


    public static void main(String[] args) {

        List<String> list=new ArrayList<String>();
        list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");

        for(String name: list){
            System.out.println(name);
        }

        list.forEach((name)->System.out.println(name));
    }
}
