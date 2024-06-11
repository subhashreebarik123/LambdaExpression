package org.example.LambdaExpression;

public class Java8ThreadExample{
   /* @Override
    public void run() {
        System.out.println("Inside thread");
    }*/


    public static void main(String[] args) {
        /*Java8ThreadExample java8ThreadExample = new Java8ThreadExample();
        Thread thread = new Thread(java8ThreadExample);
        thread.start();*/

        Runnable runnable = ()->System.out.println("inside run");

        Thread thread = new Thread();
        thread.start();
    }
}
