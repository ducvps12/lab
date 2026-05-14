/*
 * SearchArray - Encapsulates a sorted integer array with Binary Search capability
 * @author mtien
 */
package entity;

import java.util.Arrays;
import java.util.Random;

public class SearchArray {

    private int[] data;

    /**
     * Constructor with a given sorted array
     */
    public SearchArray(int[] data) {
        this.data = data;
    }

    /**
     * Constructor that generates a random sorted array of the given size
     */
    public SearchArray(int size) {
        this.data = generateSortedRandom(size);
    }

    public int[] getData() {
        return data;
    }

    private int[] generateSortedRandom(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        //loop: generate each random element
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(200) - 50;
        }
        Arrays.sort(arr);
        return arr;
    }

    public void printArray() {
        System.out.println("Array: " + Arrays.toString(data));
    }

    /**
     * Performs binary search on the sorted array
     * Returns the index of the target, or -1 if not found
     */
    public int binarySearch(int target, boolean showSteps) {
        int left = 0;
        int right = data.length - 1;
        int step = 1;

        //loop: keep narrowing the search range until found or exhausted
        while (left <= right) {
            int mid = left + (right - left) / 2;

            //condition: print debug steps if enabled
            if (showSteps) {
                printSearchStep(step, left, right, mid, target);
            }

            //condition: check if mid element matches target
            if (data[mid] == target) {
                return mid;
            } else if (data[mid] < target) {
                //condition: target is in the right half
                left = mid + 1;
            } else {
                //condition: target is in the left half
                right = mid - 1;
            }
            step++;
        }
        return -1;
    }

    private void printSearchStep(int step, int left, int right, int mid, int target) {
        System.out.println("Step " + step + ": left=" + left
                + ", right=" + right + ", mid=" + mid
                + ", a[mid]=" + data[mid] + ", target=" + target);

        //condition: show comparison result
        if (data[mid] == target) {
            System.out.println("  -> Found! a[" + mid + "] = " + target);
        } else if (data[mid] < target) {
            System.out.println("  -> " + data[mid] + " < " + target + ", search right half");
        } else {
            System.out.println("  -> " + data[mid] + " > " + target + ", search left half");
        }
    }

    /**
     * Displays the search result
     */
    public void printResult(int index, int target) {
        //condition: check if element was found
        if (index != -1) {
            System.out.println("Result: " + target + " found at index " + index);
        } else {
            System.out.println("Result: " + target + " not found in array");
        }
    }
}
