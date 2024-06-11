package org.example.LambdaExpression;



interface Addable {

        int add (int a, int b);
    }
    class LambdaExpressionExample {
        public static void main(String[] args) {

            Adder adder = (a, b) -> (a+b);
            System.out.println(adder.add(10, 20));

            Adder adder1 = (int a, int b) -> {
                return (a + b);
            };
                System.out.println(adder.add(100, 200));

            }
        }