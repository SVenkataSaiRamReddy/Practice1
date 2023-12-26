package org.example;
import java.util.*;
public class CollectionDemo {
    public static void main(String[] args) {
        // List: Ordered, duplicates allowed
        List<String> names = new ArrayList<>();
        names.add("Ram");
        names.add("Bobby");
        names.add("Krishna");
        System.out.println("List: " + names);

        // Set: Unordered, no duplicates
        Set<Integer> Set = new HashSet<>();
        Set.add(1);
        Set.add(40);
        Set.add(20); // Adding a duplicate has no effect
        System.out.println("Set: " + Set);

        // Queue: FIFO (First-In-First-Out)
        Queue<String> Queue = new LinkedList<>();
        Queue.add(" Step 1");
        Queue.add("Step 2");
        Queue.add("Step 3");
        System.out.println("Queue (front-most): " + Queue.peek());
        Queue.poll(); // Removes and returns the front element
        System.out.println("Queue (after removing front): " + Queue);

        // Map: Key-value pairs
        Map<String, Integer> marksMap = new HashMap<>();
        marksMap.put("Ronit", 45);
        marksMap.put("Venky", 70);
        marksMap.put("Sai",100);
        System.out.println("Map: " + marksMap);

        // Accessing map values
        int RonitScore = marksMap.get("Ronit");
        System.out.println("Ronit's marks: " + RonitScore);
    }
}
