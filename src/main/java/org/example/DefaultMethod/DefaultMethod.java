package org.example.DefaultMethod;

interface Student {

    //default method
     default void say(){
     System.out.println("Default method");
 }
     //Abstract method
    void saymore(String msg);

     //Static method
     static void saylouder(String msg){
         System.out.println(msg);
     }
}
public class DefaultMethod implements Student{

    @Override
    public void saymore(String msg) {  //implementing abstract method
    System.out.println(msg);
    }

    public static void main(String[] args) {
        DefaultMethod1 dm = new DefaultMethod1();
        dm.say();              //  Calling default method
        dm.saymore("work is life");  //calling abstract method
        Student.saylouder("Hello mama"); //calling static method
    }
}
