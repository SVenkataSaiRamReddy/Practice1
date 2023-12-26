package org.example;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        // Create a HashMap to store key-value pairs
        Map<String, Integer> marksMap = new HashMap<>();

        // Add key-value pairs to the map
        marksMap.put("Yuta", 95);
        marksMap.put("Satoru", 82);
        marksMap.put("Yuji", 78);

        // Accessing values using keys
        int yutaScore = marksMap.get("Yuta");
        System.out.println("Yuta's score: " + yutaScore);

        // Checking for key existence
        if (marksMap.containsKey("Satoru")) {
            System.out.println("Satoru has a score in the map.");
        }

        // Iterating over key-value pairs
        for (Map.Entry<String, Integer> entry : marksMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Removing a key-value pair
        marksMap.remove("Yuji");
        System.out.println("Map after removing Yuji: " + marksMap);

        // Replacing a value
        marksMap.replace("Yuta", 98);
        System.out.println("Yuta's updated score: " + marksMap.get("Yuta"));
    }
}
