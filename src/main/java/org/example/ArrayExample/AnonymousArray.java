package org.example.ArrayExample;

public class AnonymousArray {
    static void print(int arr[]){
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }

    public static void main(String args[]){
        print(new int[]{10,22,44,66});
    }
}
