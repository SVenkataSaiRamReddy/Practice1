package org.example;

public class ArrayExample {

    public static void main(String[] args) {
        // Initializing an array of integers
        int[] numbers = { 50, 1, 15, 250, 205 };

        // Accessing elements of the array using a for loop
        System.out.println("Elements of the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Modifying an element in the array
        numbers[2] = 30;

        // Accessing and displaying the modified element
        System.out.println("\nModified element at index 2: " + numbers[2]);

        // Calculating the sum of elements in the array
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("\nSum of all elements in the array: " + sum);

        // Initializing and printing a 2D array
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("\n2D Array (Matrix):");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
