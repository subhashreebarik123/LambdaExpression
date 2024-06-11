package org.example.MethodReference;


interface  Messageable {
     void message();
}

public class ConstructorRefExample {


    ConstructorRefExample(){
        System.out.println("inside constructor");
    }

    public static void main(String[] args) {
        Messageable messageable = ConstructorRefExample::new;
        messageable.message();
    }
}
