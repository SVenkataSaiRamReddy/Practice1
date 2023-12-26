package org.example;

public class PublicClass
{
    public void show(){
        System.out.println("Public class Public Method");
    }
    private void myPrivateMethod()
    {
        System.out.println("This is a private method can be accessed within the same class");
    }
    public void usingPrivateMethod(){
        myPrivateMethod();
        System.out.println("Successfully called my private method");
    }
}
