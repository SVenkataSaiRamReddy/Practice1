package org.example;

import java.util.regex.*;

public class RegexVerifier {
    public static void main(String[] args) {
        // Define a regular expression pattern
        String regexPattern = "[a-zA-Z]+\\d+"; // Example: Alphabets followed by digits

        // Input strings to test against the regular expression pattern
        String[] testStrings = {
            "abc123",   // Valid match
            "def",      // Invalid match (no digits)
            "123",      // Invalid match (no alphabets)
            "XYz789",// Valid match
             "abc@123" // Special characters are not part of the regex I used
        };

        // Compile the regular expression pattern
        Pattern pattern = Pattern.compile(regexPattern);

        // Test each input string against the pattern
        for (String str : testStrings) {
            Matcher matcher = pattern.matcher(str);
            boolean isMatch = matcher.matches();
            if (isMatch) {
                System.out.println("'" + str + "' matches the pattern '" + regexPattern + "'");
            } else {
                System.out.println("'" + str + "' does not match the pattern '" + regexPattern + "'");
            }
        }
    }
}
