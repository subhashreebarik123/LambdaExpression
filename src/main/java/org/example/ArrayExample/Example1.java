package org.example.ArrayExample;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        int a[] = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

       /* for(int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }

        for(int no :a){
            System.out.println(no);
        } */
        Arrays.stream(a).forEach(n -> System.out.println(n));
    }


}