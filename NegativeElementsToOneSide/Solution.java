package NegativeElementsToOneSide;

import java.util.Arrays;

public class Solution {

    // public static int[] negativesAtOneEnd(int [] arr){
    //     int pivot = -1; // pivot pointer
    //     for(int j = 0; j < arr.length; j++){
    //         if(arr[j] < 0){
    //             int temp = 0;
    //             pivot++;
    //             temp = arr[pivot];
    //             arr[pivot] = arr[j];
    //             arr[j] = temp;
    //         }
    //     }
    //     return arr;
    // }

    public static int[] negativesAtOneEnd(int [] arr){
        int l = arr.length;
        int pivot = l; // pivot pointer
        for(int j = l-1; j >= 0; j--){
            if(arr[j] < 0){
                int temp = 0;
                pivot--;
                temp = arr[pivot];
                arr[pivot] = arr[j];
                arr[j] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,-9,4,-6,7,4,-3,-4,9};
        System.out.println(Arrays.toString(negativesAtOneEnd(arr)));
        
    }
}
