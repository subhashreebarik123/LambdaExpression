package org.example.LambdaExpression;

interface Sample2 {
    public String  display(String name);
}
 class LambdaExample3 implements  Sample2{
     public static void main(String[] args) {
              Sample2 sample2 = new LambdaExample3();
             String name = sample2.display("sujitd");
             System.out.println(name);

     }

     @Override
     public String display(String name) {
         return name;
     }
 }
