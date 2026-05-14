/*
 * BubbleSortArray - Encapsulates an integer array with Bubble Sort capability
 * @author mtien
 */
package entity;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortArray {

    private int[] data;

    /**
     * Constructor with a given array
     */
    public BubbleSortArray(int[] data) {
        this.data = data;
    }

    /**
     * Constructor that generates a random array of the given size
     */
    public BubbleSortArray(int size) {
        this.data = generateRandom(size);
    }

    public int[] getData() {
        return data;
    }

    private int[] generateRandom(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        //loop: generate each random element for the array
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(10);
        }
        return arr;
    }

    public void printArray(String title) {
        System.out.println(title + Arrays.toString(data));
    }

    public void bubbleSort(boolean debug) {
        //loop (outer): controls the number of passes through the array
        for (int i = 0; i < data.length - 1; i++) {
            //loop (inner): compares adjacent elements in each pass
            for (int j = 0; j < data.length - i - 1; j++) {
                //condition: print debug info if debug mode is on
                if (debug) {
                    printDebugStep(j);
                }
                //condition: swap if current element is greater than next
                if (data[j] > data[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
    }

    private void swap(int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    private void printDebugStep(int index) {
        System.out.print(Arrays.toString(data) + "   ");
        //condition: check comparison result for debug output
        if (data[index] > data[index + 1]) {
            System.out.println(data[index] + " > " + data[index + 1] + ", swap");
        } else {
            System.out.println(data[index] + " < " + data[index + 1] + ", ok");
        }
    }
}
