package org.example.FunctionalInterface;


    interface Printable1 {
        void print(String msg);  //abstract method
        int hashcode();
        String toString();
    }
    public class NumberOfObjects implements Printable1 {

        @Override
        public void print(String msg) {
            System.out.println(msg);
        }

        @Override
        public int hashcode() {
            return 0;
        }

        public static void main(String[] args) {
            NumberOfObjects no = new NumberOfObjects();
            no.print("Hello World");
        }
}
