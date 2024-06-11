package org.example.LambdaExpression;

interface Multiple {

        String say(String message);
    }

     class LambdaExpressionExample1{
        public static void main(String[] args) {

            Multiple person = (message)-> {
                String str1 = "I would like to say, ";
                String str2 = str1 + message;
                return str2;
            };
            System.out.println(person.say("time is precious."));
        }
    }

