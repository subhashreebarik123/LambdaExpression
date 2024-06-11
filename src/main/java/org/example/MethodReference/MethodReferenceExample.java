package org.example.MethodReference;

interface Say{
    void say();
}

public class MethodReferenceExample {
    public  void saySomething(){
        System.out.println("Hello, this is static method.");
    }

    public static void main(String[] args) {

        MethodReferenceExample methodReferenceExample = new MethodReferenceExample();
        Say say = methodReferenceExample::saySomething;
        say.say();

        /*Say say = MethodReferenceExample::saySomething;
        say.say();*/

    }
}
