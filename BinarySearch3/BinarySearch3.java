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
        Scanner scanner = new Scanner(System.in);

        // --- CÁCH 1: Dùng mảng cố định của đề bài ---
        int[] array = {-1, 5, 6, 18, 19, 25, 46, 78, 102, 114};
        
        // --- CÁCH 2: Dùng mảng ngẫu nhiên (Bỏ comment 2 dòng dưới để dùng) ---
        // int arraySize = getPositiveInteger(scanner, "Enter number of elements: ");
        // int[] array = generateSortedRandomArray(arraySize);

        displayArray(array);

        // Step 1: Enter the search value
        int searchValue = getPositiveInteger(scanner, "Enter search value: ");

        // Step 2: Search using binary search
        boolean showSteps = true; 
        int index = binarySearch(array, searchValue, showSteps);
        
        displaySearchResult(index, searchValue);

        scanner.close();
    }

    public static int getPositiveInteger(Scanner scanner, String message) {
        int number;
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Input cannot be empty!");
                continue;
            }

            try {
                number = Integer.parseInt(input);
                if (number > 0) return number;
                else System.out.println("Please enter a positive integer greater than 0.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
            }
        }
    }

    public static int[] generateSortedRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size * 10);
        }
        Arrays.sort(array);
        return array;
    }

    public static void displayArray(int[] array) {
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static int binarySearch(int[] array, int searchValue, boolean showSteps) {
        int left = 0, right = array.length - 1;
        int step = 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = array[mid];

            if (showSteps) {
                System.out.print("Step " + step + " (middle element is " + midValue + "): [");
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

            if (midValue == searchValue) return mid;
            if (midValue < searchValue) left = mid + 1;
            else right = mid - 1;
            step++;
        }
        
        if (showSteps) {
            System.out.println("Step " + step + " (searched value is absent)");
        }
        return -1;
    }

    public static void displaySearchResult(int index, int searchValue) {
        if (index != -1) {
            System.out.println("Found " + searchValue + " at index: " + index);
        } else {
            System.out.println("Not found: " + searchValue + " in the array.");
        }
    }
}
