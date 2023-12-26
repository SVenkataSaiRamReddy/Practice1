package org.example;
class MyMethods{
    public void show(){
        System.out.println("This is a void method with no parameters");
    }
    public void display(int a){
        System.out.println("This is a void method with a parameter and the parameter a ="+a);
    }
    public int sum(int a, int b){
        System.out.println("\nThis is return type method");
        return a+b;
    }
}
public class MethodsExample
{
    public static void main(String[] args) {
        MyMethods mm= new MyMethods();
        mm.show();  // Method Calling
        mm.display(10);
        System.out.println(mm.sum(10,20));
    }

}
