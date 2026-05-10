/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarysearch3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author mtien
 */
public class BinarySearch3 {

    public static void main(String[] args) {
        // Step 1: Initialize resources
        Scanner scanner = new Scanner(System.in);

        // Step 2: Set up the array (Choose fixed or random)
        // --- Option 1: Fixed array from assignment ---
        int[] array = {-1, 5, 6, 18, 19, 25, 46, 78, 102, 114};
        
        // --- Option 2: Random array (Uncomment to use) ---
        // int arraySize = getInputInteger(scanner, "Enter number of elements: ");
        // int[] array = generateSortedArray(arraySize);

        // Step 3: Display the sorted array
        displayArray(array);

        // Step 4: Get search value from user
        int searchValue = getInputInteger(scanner, "Enter search value: ");

        // Step 5: Perform binary search and show steps
        boolean showSteps = true; 
        int index = performBinarySearch(array, searchValue, showSteps);
        
        // Step 6: Display the final result
        displayResult(index, searchValue);

        // Step 7: Close resources
        scanner.close();
    }

    /**
     * Get a positive integer from user input
     */
    public static int getInputInteger(Scanner scanner, String prompt) {
        int number;
        // Loop until valid input is received
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            // Check if input is empty
            if (input.isEmpty()) {
                System.out.println("Input cannot be empty!");
                continue;
            }

            try {
                number = Integer.parseInt(input);
                // Condition: Number must be positive
                if (number > 0) {
                    return number;
                } else {
                    System.out.println("Please enter a positive integer > 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter an integer.");
            }
        }
    }

    /**
     * Generate an array with random values and sort it
     */
    public static int[] generateSortedArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        // Loop to fill array with random numbers
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size * 10);
        }
        // Sort the array (Binary search requires a sorted array)
        Arrays.sort(array);
        return array;
    }

    /**
     * Display the current array elements
     */
    public static void displayArray(int[] array) {
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    /**
     * Core Binary Search logic with step-by-step display
     */
    public static int performBinarySearch(int[] array, int searchValue, boolean showSteps) {
        int left = 0;
        int right = array.length - 1;
        int step = 1;

        // Loop while search range is valid
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = array[mid];

            // Condition: Check if user wants to see steps
            if (showSteps) {
                System.out.print("Step " + step + " (middle element is " + midValue + "): [");
                // Loop to print elements within current range
                for (int i = 0; i < array.length; i++) {
                    if (i >= left && i <= right) {
                        System.out.print(array[i]);
                    } else {
                        System.out.print(" ");
                    }
                    if (i < array.length - 1) System.out.print(", ");
                }
                System.out.println("]");
            }

            // Condition: Compare middle value with search value
            if (midValue == searchValue) {
                return mid; // Found!
            } else if (midValue < searchValue) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
            step++;
        }
        
        // Final condition: if not found and showSteps is on
        if (showSteps) {
            System.out.println("Step " + step + " (searched value is absent)");
        }
        return -1;
    }

    /**
     * Display the index or failure message
     */
    public static void displayResult(int index, int searchValue) {
        // Condition: Check if index is valid
        if (index != -1) {
            System.out.println("Found " + searchValue + " at index: " + index);
        } else {
            System.out.println("Not found: " + searchValue + " in the array.");
        }
    }
}
