package org.example.FunctionalInterface;

interface Printable {
    void print(String msg);  //abstract method
}
public class FuntionalInterface implements Printable{

    @Override
    public void print(String msg) {
   System.out.println(msg);
    }

    public static void main(String[] args) {
        FuntionalInterface FI = new FuntionalInterface();
        FI.print("Hello world");
    }
}

