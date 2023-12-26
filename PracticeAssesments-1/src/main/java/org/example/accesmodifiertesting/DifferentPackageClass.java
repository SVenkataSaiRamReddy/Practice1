package org.example.accesmodifiertesting;

import org.example.ProtectedClass;
import org.example.PublicClass;
class Child extends ProtectedClass{
    public void accessingProtectedMethod(){
        System.out.println("Accessing protected method from child class");
        myProtectedMethod();
    }
}
public class DifferentPackageClass {
    public static void main(String[] args) {
        //DefaultClass: we can't access this class because default class cannot be
        // accessed outside of a package from where it is created
        PublicClass a=new PublicClass();
        a.show();
        ProtectedClass f= new ProtectedClass();
        // f.myProtectedMethod() this cannot be called because protected methods cannot be accessed from a different
        //package unless it is inherited
        Child ch= new Child();
        // f.myProtectedMethod() this cannot be called because protected methods cannot be accessed from a different
        //package unless it is inherited
        ch.accessingProtectedMethod();
        }

}

