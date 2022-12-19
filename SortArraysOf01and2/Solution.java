package SortArraysOf01and2;

import java.util.Arrays;

/*
 * Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo
 * 
 */

public class Solution {

    // Brute Force Way
    // public static int [] sortTheArray(int [] arr){
    //     int sum = 0;
    //     int numberOfTwos = 0;
    //     int l = arr.length;
    //     for(int i = 0; i < l; i++){
    //         if(arr[i] == 2)
    //             numberOfTwos++; // find number of 2s in the array (alternatively any other than 2 can also be chosen)
    //         sum = sum+arr[i]; //find the total sum of elements of the array
    //     }
    //     int ones = sum - (2*numberOfTwos); // find number of ones
    //     int zeroes = l - (ones + numberOfTwos); // find number of zeroes
    //     for(int i = 0; i < zeroes; i++){
    //         arr[i] = 0;
    //     }
    //     for(int i = zeroes; i < zeroes+ones; i++){
    //         arr[i] = 1;
    //     }
    //     for(int i = zeroes+ones; i < l; i++){
    //         arr[i] = 2;
    //     }
    //     return arr;
    // }


    //other better approach
    public static int [] sortTheArray(int [] arr){
        int l = arr.length;
        int numberOfTwos = 0;
        int numberOfTOnes = 0;
        int numberOfZeroes = 0;
        for(int i = 0; i < l; i++){
            if(arr[i] == 2)
                numberOfTwos++;
            if(arr[i] == 1)
                numberOfTOnes++;
            if(arr[i] == 0)
                numberOfZeroes++;
            
        }
        for(int i = 0; i < numberOfZeroes; i++){
            arr[i] = 0;
        }
        for(int i = numberOfZeroes; i < (numberOfZeroes+numberOfTOnes); i++){
            arr[i] = 1;
        }
        for(int i = (numberOfZeroes+numberOfTOnes); i < l; i++){
            arr[i] = 2;
        }
        return arr;
    }


    
    public static void main(String[] args) {
        int [] arr = {1,2,0,0,2,0,2,1,0,0,0,0,2,2,1,1,1};
        System.out.println(Arrays.toString(sortTheArray(arr)));
    }
}
