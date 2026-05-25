/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import array.Array;
import utils.Validator;

/**
 *
 * @author Precision 5530
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = Validator.getInt("Enter number of array: ", 
                "Error range(number>0)", "Invalid!", 1, Integer.MAX_VALUE);
        Array array = new Array(number);
        System.out.print("Unsorted array:");
        System.out.println(array.toString());
        try {
            array.bubbleSort(true);
        } catch (IllegalArgumentException e) {
            System.out.println("SORT FAIL!");
            return;
        }
        System.out.print("Sorted array:");
        System.out.println(array.toString());
    }
    
}
