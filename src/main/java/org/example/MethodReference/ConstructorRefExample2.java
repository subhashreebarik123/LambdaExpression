package org.example.MethodReference;

interface Printable {
    public void print ();
}
 public class ConstructorRefExample2{
    public void constructorRef(){
        System.out.println("Inside Constructor");
    }

     public static void main(String[] args) {
         Printable printable = ConstructorRefExample2::new;
         printable.print();
     }

 }

