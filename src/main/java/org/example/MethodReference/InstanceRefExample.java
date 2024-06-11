package org.example.MethodReference;

interface Stadium {
    public void run ();
}

public class InstanceRefExample {
    public void running() {
        System.out.println("Instance method");
    }

    public static void main(String[] args) {
       InstanceRefExample instanceRefExample = new InstanceRefExample();
       Stadium stadium = instanceRefExample::running;
       stadium.run();
    }

}
