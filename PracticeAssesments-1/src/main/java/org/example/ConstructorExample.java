package org.example;
class Dummy{
    Dummy(){
        System.out.println("This is a default constructor");
    }
    Dummy(int a){
        System.out.println("\nThis is a parameterized constructor and the parameter is: "+a);
    }
}
public class ConstructorExample {
    public static void main(String[] args) {
        Dummy op= new Dummy();
        Dummy pc= new Dummy(10);
    }

}
