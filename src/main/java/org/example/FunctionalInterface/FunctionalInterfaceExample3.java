package org.example.FunctionalInterface;


interface Sample{
    default void doIt(){
        System.out.println("Do it now");
    }
}
@FunctionalInterface
interface Sayable extends Sample{
    void say(String msg);   // abstract method
}
public class FunctionalInterfaceExample3 implements Sayable {
    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample3 fie = new FunctionalInterfaceExample3();
        fie.say("Hello there");
        fie.doIt();
    }
}
