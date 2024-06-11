package org.example.LambdaExpression;

interface Sample1 {
    public void run();
}
 class LambdaExample2{
     public static void main(String[] args) {
         Sample1 s1 = ()->{
             System.out.println("Lambda Running");
         };
         s1.run();
     }
 }
