package org.example.DefaultMethod;

interface Student1 {

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
public class DefaultMethod1 implements Student1{
    @Override
    public void saymore(String msg) {  //implementing abstract method
        System.out.println(msg);
    }
    public static void main(String[] args) {
        DefaultMethod1 dm = new DefaultMethod1();
        dm.say();
        dm.saymore("work is life");
        Student.saylouder("Hello world");
    }
}
