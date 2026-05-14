/*
 * Main - Entry point, coordinates Binary Search program flow
 * @author mtien
 */
package ui;

import entity.SearchArray;
import utils.InputValidator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputValidator validator = new InputValidator(scanner);
        boolean showSteps = true;

        //step 1: setup the array (test mode or user input)
        SearchArray array = getArray(validator);

        //step 2: display the sorted array
        array.printArray();

        //step 3: get search value from user
        int searchValue = validator.inputInteger("Enter search value: ");

        //step 4: perform binary search and show steps
        int index = array.binarySearch(searchValue, showSteps);

        //step 5: display the final result
        array.printResult(index, searchValue);

        //step 6: close resources
        scanner.close();
    }

    private static SearchArray getArray(InputValidator validator) {
        //condition: use fixed array for testing, uncomment below for random
        // int size = validator.inputPositiveInt("Enter number of elements: ");
        // return new SearchArray(size);
        return new SearchArray(new int[]{-1, 5, 6, 18, 19, 25, 46, 78, 102, 114});
    }
}
