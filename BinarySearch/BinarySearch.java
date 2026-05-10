/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarysearch;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;;
/**
 *
 * @author mtien
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Step 1: Enter the array length
        int length = getInt("Enter number of array: ", "Type error! Please enter integer number >0", 1, Integer.MAX_VALUE);
        //Step 2: Create, sort and display arrays
        int[] array = genRandomArray(length);
        sortArray(array);
        displaySortedArray(array);
        //Step 3: Enter the value to search for
        int searchNumber = getInt("Enter search value: ", "Type error! Please enter interger number >0", 0, Integer.MAX_VALUE);
        //Step 4: Binary Search and display result
        int indexOfSearchNumber = binarySearch(searchNumber, array, true);
        displayIndexOfSearchNumber(searchNumber, indexOfSearchNumber);
    }

    public static int getInt(String promptMessage, String typeErrorMessage, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print(promptMessage);
            try {
                int input = Integer.parseInt(scanner.nextLine());
                if (input >= min && input <= max) {
                    return input;
                } else {
                    System.out.println("Value must be in range " + min + " to " + max);
                }
            } catch (NumberFormatException e) {
                System.out.println(typeErrorMessage);
            }
        } while (true);
    }

    public static int[] genRandomArray(int length) {
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(length * 10); // Tăng biên để giá trị không bị lặp
        }
        return array;
    }

    public static void sortArray(int[] array) {
        Arrays.sort(array);
    }

    public static void displaySortedArray(int[] array) {
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static int binarySearch(int searchNum, int[] array, boolean test) {
        int left = 0;
        int right = array.length - 1;
        int step = 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (searchNum == array[mid]) {
                if (test) {
                    System.out.print("Step " + step + " (middle element is " + array[mid] + "): [");
                    for (int i = 0; i < array.length; i++) {
                        if (i >= left && i <= right) {
                            System.out.print(array[i]);
                        } else {
                            System.out.print(" ");
                        }
                        if (i < array.length - 1) {
                            System.out.print(", ");
                        }
                    }
                    System.out.println("]");
                }
                return mid;
            } else if (searchNum < array[mid]) {
                if (test) {
                    System.out.print("Step " + step + " (middle element is " + array[mid] + " < " + searchNum + "): [");
                    for (int i = 0; i < array.length; i++) {
                        if (i >= left && i <= right) {
                            System.out.print(array[i]);
                        } else {
                            System.out.print(" ");
                        }
                        if (i < array.length - 1) {
                            System.out.print(", ");
                        }
                    }
                    System.out.println("]");
                }
                right = mid - 1;
            } else {
                if (test) {
                    System.out.print("Step " + step + " (middle element is " + array[mid] + " > " + searchNum + "): [");
                    for (int i = 0; i < array.length; i++) {
                        if (i >= left && i <= right) {
                            System.out.print(array[i]);
                        } else {
                            System.out.print(" ");
                        }
                        if (i < array.length - 1) {
                            System.out.print(", ");
                        }
                    }
                    System.out.println("]");
                }
                left = mid + 1;
            }
            step++;
        }

        if (test) {
            System.out.print("Step " + step + " (searched value is absent): [");
            for (int i = 0; i < array.length; i++) {
                if (i >= left && i <= right) {
                    System.out.print(array[i]);
                } else {
                    System.out.print(" ");
                }
                if (i < array.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
        return -1;
    }

    public static void displayIndexOfSearchNumber(int searchNum, int indexOfSearchNum) {
        if (indexOfSearchNum != -1) {
            System.out.println("Found " + searchNum + " at index: " + indexOfSearchNum);
        } else {
            System.out.println("Not found: " + searchNum + " in the array.");
        }
    }
}
