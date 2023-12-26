package org.example;

import java.util.NoSuchElementException;

public class ProtectedClass {
    protected void myProtectedMethod(){
        System.out.println("This can be only called from the default package or from the inherited object");
    }
}
