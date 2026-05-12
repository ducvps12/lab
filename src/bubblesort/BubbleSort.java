/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubblesort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * BubbleSort - Sort an array using the Bubble Sort algorithm
 *
 * @author mtien
 */
public class BubbleSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean testMode = false;

        // Step 1: Get array input
        int[] arr = DoGetInputArray(scanner, testMode);
        // Step 2: Print the unsorted array
        DoPrintArray("Unsorted array: ", arr);
        // Step 3: Sort the array using Bubble Sort
        DoBubbleSort(arr, testMode);
        // Step 4: Print the sorted array
        DoPrintArray("Sorted array: ", arr);
    }

    private static int[] DoGetInputArray(Scanner scanner, boolean testMode) {
        // Condition: If test mode is enabled, return a fixed array
        if (testMode) {
            return new int[]{5, 1, 12, -5, 16};
        } else {
            int size = DoInputArraySize(scanner);
            return DoGenerateRandomArray(size);
        }
    }

    private static int DoInputArraySize(Scanner scanner) {
        int size;
        // Loop: Keep looping until the user enters a valid positive integer
        while (true) {
            System.out.print("Enter number of array: ");
            try {
                size = Integer.parseInt(scanner.nextLine().trim());
                // Condition: Check if size is greater than 0
                if (size > 0) {
                    return size;
                }
                System.out.println("Size must be positive");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
    }

    private static int[] DoGenerateRandomArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        // Loop: Generate each random element for the array
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(10);
        }
        return arr;
    }

    private static void DoPrintArray(String title, int[] arr) {
        System.out.println(title + Arrays.toString(arr));
    }

    private static void DoBubbleSort(int[] arr, boolean debug) {
        // Loop (outer): Controls the number of passes through the array
        for (int i = 0; i < arr.length - 1; i++) {
            // Loop (inner): Compares adjacent elements
            for (int j = 0; j < arr.length - i - 1; j++) {
                // Condition: If debug is enabled, print current state
                if (debug) {
                    DoPrintDebugStep(arr, j);
                }
                // Condition: If current element is greater than next element, swap them
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private static void DoPrintDebugStep(int[] arr, int index) {
        System.out.print(Arrays.toString(arr) + "   ");
        // Condition: Check if current element is greater than the next element
        if (arr[index] > arr[index + 1]) {
            System.out.println(arr[index] + " > " + arr[index + 1] + ", swap");
        } else {
            System.out.println(arr[index] + " < " + arr[index + 1] + ", ok");
        }
    }
}


