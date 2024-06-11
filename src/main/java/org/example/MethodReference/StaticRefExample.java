package org.example.MethodReference;

interface Stadium1 {
    void run ();
}

    class StaticRefExample {
    public static void running() {
        System.out.println("Static  method");
    }

    public static void main(String[] args) {
        Stadium1 stadium1 = StaticRefExample::running;
        stadium1.run();
    }

}
