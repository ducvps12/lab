/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import array.MyArray;
import utils.Validator;

/**
 *
 * @author Precision 5530
 */
public class Main {

    public static void main(String[] args) throws Exception {
        int number = Validator.getInput("Enter number of array: ",
                "Error range(number>0)", "Invalid!", 1, Integer.MAX_VALUE);
        MyArray array = new MyArray(number);
        System.out.println("Unsorted array:");
        array.printArray();
        try {
            array.sortArray();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("Sorted array:");
        array.printArray();
    }
}
