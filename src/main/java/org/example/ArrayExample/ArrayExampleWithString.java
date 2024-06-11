package org.example.ArrayExample;

import java.util.Arrays;

public class ArrayExampleWithString {
    public static void main(String[] args) {
        String x [] = new String[5];
        x[0] = "Mama";
        x[1] = "Maa";
        x[2] = "Subha";
        x[3] = "Shree";
        x[4] = "barik";

        for (String name :x){
            System.out.println(name);
        }
        for(int s = 0;s<x.length;s++){
            System.out.println(x[s]);
        }
        Arrays.stream(x).forEach(n->System.out.println(n));
    }


}
