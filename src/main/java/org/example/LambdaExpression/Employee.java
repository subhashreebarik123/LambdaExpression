package org.example.LambdaExpression;

interface Employee {
    public void fun(String name);
}
 class ExampleOfLambda{
     public static void main(String[] args) {
         Employee employee =(name)->{
             System.out.println("Employee for Office");
         };
          employee.fun("subhashree");

          Employee employee1 =(name)->{
              System.out.println("Inside Employee ");
          };
          employee1.fun("Mama");
     }

 }
