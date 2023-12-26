package org.example;

public class TypeCasting
{
    public static void main(String[] args) {
        //Implicit TypeCasting
        int b= 10 ;
        float a = b;
        char e= 'W';
        int f= e;
        System.out.println("Implicit TypeCasting conversion- Converting int to float");
        System.out.println("The Value of b ="+b);
        System.out.println("The Value of a ="+a);
        System.out.println("\nImplicit TypeCasting conversion- Converting char to int");
        System.out.println("The Value of e ="+e);
        System.out.println("The Value of f ="+f);
        System.out.println("\n"+"=".repeat(50));
        // Explicit TypeCasting
        float c = 12.8f;
        int d = (int) c;
        long l=2000;
        int m=(int)l;
        System.out.println("\nExplicit TypeCasting Conversion-Converting float to int");
        System.out.println("The Value of c ="+c);
        System.out.println("The Value of d ="+d);
        System.out.println("\nExplicit TypeCasting Conversion-Converting long to int");
        System.out.println("The Value of l ="+l);
        System.out.println("The Value of m ="+m);
    }
}
