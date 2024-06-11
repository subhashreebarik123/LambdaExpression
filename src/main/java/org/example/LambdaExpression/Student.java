package org.example.LambdaExpression;

interface Student {
    public void draw();
}
   class LambdaExample  {
    public static void main(String[] args) {



        //Student student1 = ()-> {System.out.println("draw implementation");};
        //student1.draw();

        Student student = new Student() {
            @Override
            public void draw() {
                System.out.println("inside drawimpl");
            }
        };
        student.draw();

        Student student1 = ()->{ System.out.println("inside drawimpl");
        System.out.println("lambda expression");};
        student1.draw();

    }


   }
