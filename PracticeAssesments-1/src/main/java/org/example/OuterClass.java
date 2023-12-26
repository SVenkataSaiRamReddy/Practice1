package org.example;

public class OuterClass {
    private int outerVariable = 10;

    // Inner class within OuterClass
    class InnerClass {
        void display() {
            System.out.println("Value of outerVariable from InnerClass: " + outerVariable);
        }
    }

    public static void main(String[] args) {
        // Creating an instance of OuterClass
        OuterClass outerObj = new OuterClass();

        // Creating an instance of InnerClass using the outer object
        OuterClass.InnerClass innerObj = outerObj.new InnerClass();

        // Accessing a method of the inner class
        innerObj.display();
    }
}
