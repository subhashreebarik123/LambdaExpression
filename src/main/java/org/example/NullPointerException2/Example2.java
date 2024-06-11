package org.example.NullPointerException2;

public class Example2 {
    public void foo()
    {
        System.out.println("In the method foo.");
    }

    public static void main(String args[])
    {
        Example2 obj = null; // assigning null value

        // invoking the method foo()
        obj.foo();
    }
}
