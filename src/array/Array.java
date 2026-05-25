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
public class Array {
    private int array[] = null;
    
    public Array(int number){
        Random rand = new Random();
        array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = rand.nextInt(number);
        }
    }
    
    @Override
    public String toString(){
        String str = " [";
        for(int i = 0; i < array.length; i++){
            str += array[i];
            if(i < array.length - 1){
                str += ", ";
            }else{
                str +="]";
            }
        }
        return str;
    }
    
    public void bubbleSort(boolean increase){
        int temp;
        for(int i = 0; i < array.length - 1; i++){
                    for(int j = 0; j < array.length - 1 - i; j++){
                        if(increase){
                            if(array[j] > array[j+1]){
                                temp = array[j];
                                array[j] = array[j+1];
                                array[j+1]=temp;
                            }
                        }else {
                            if(array[j] < array[j + 1]){
                                temp = array[j];
                                array[j] = array[j+1];
                                array[j+1] = temp;
                            }
                        }
                    }
                }   
        }
}
