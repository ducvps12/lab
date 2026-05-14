/*
 * Main - Entry point, coordinates program flow
 * @author mtien
 */
package ui;

import entity.BubbleSortArray;
import utils.InputValidator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputValidator validator = new InputValidator(scanner);
        boolean testMode = true;

        //step 1: get the array (test mode or user input)
        BubbleSortArray array = getArray(validator, testMode);

        //step 2: display the unsorted array
        array.printArray("Unsorted array: ");

        //step 3: sort using Bubble Sort
        array.bubbleSort(testMode);

        //step 4: display the sorted array
        array.printArray("Sorted array: ");
    }

    private static BubbleSortArray getArray(InputValidator validator, boolean testMode) {
        //condition: if testMode is enabled, use a fixed array for testing
        if (testMode) {
            return new BubbleSortArray(new int[]{5, 1, 12, -5, 16});
        } else {
            int size = validator.doInputPositiveInt("Enter number of array: ");
            return new BubbleSortArray(size);
        }
    }
}
