package org.example.DefaultMethod;

 abstract class AbstractClass{
     public AbstractClass() {    //constructor
     System.out.println("Creating constructor in abstract class");
     }

     abstract int add(int a, int b);  //abstract method
         int sub (int a , int b){     //nonabstract method
           return a -b;

     }
     static int multi(int a , int b){    //static method
             return a*b;
     }
    public static class AbstractTest extends AbstractClass{

        @Override
        int add(int a, int b) {
            return a+b;      //implimenting abstract method
        }

        public static void main(String[] args) {
            AbstractTest at  = new AbstractTest();
            int result1 = at.add(20,10);   //calling abstract method
            int result2 = at.sub(20,10);   //calling  non-abstract method
            int result3 = AbstractClass.multi(20,10);  //calling static method
            System.out.println("Addition"+result1);
            System.out.println("substraction"+result2);
            System.out.println("multiplication"+result3);
        }
    }
 }

