/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Random;

/**
 *
 * @author Precision 5530
 */
public class MyArray {

    private int[] a;

    public MyArray(int n) throws Exception {
        setSize(n);
    }

    public int[] getArray() {
        return a;
    }

    public void setSize(int size) throws Exception {
        if (size <= 0) {
            throw new Exception("Size must be > 0.");
        }
        a = new int[size];
        genRandom();
    }

    public void genRandom() throws Exception {
        if (a == null) {
            throw new Exception("Array is not initialized.");
        }
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(a.length);
        }
    }

    public void sortArray() {
        if (a == null) {
            return;
        }
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public void printArray() throws Exception {
        if (a == null) {
            throw new Exception("Can't be null");
        }
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
