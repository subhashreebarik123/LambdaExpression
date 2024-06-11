package org.example.LambdaExpression;

interface Adder {
    int add (int a, int b);
}
class LambdaExpression{
    public static void main(String[] args) {
        Adder adder =(a, b) -> (a+b);
        System.out.println(adder.add(10,20 ));

        Adder adder1=(int a,int b)->(a+b);
        System.out.println(adder.add(100,200));
    }
}
