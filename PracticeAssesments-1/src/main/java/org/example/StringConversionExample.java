package org.example;

public class StringConversionExample {

    public static void main(String[] args) {
        // Create a String
        String str = "Hello.";

        // Convert String to StringBuffer
        StringBuffer stringBuffer = new StringBuffer(str);

        // Convert String to StringBuilder
        StringBuilder stringBuilder = new StringBuilder(str);

        // Display the original String and the converted StringBuffer and StringBuilder
        System.out.println("Original String: " + str);
        System.out.println("Converted to StringBuffer: " + stringBuffer);
        System.out.println("Converted to StringBuilder: " + stringBuilder);
    }
}
