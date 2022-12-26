package CyclicallyRotateAnArrayByOne;

import java.util.Arrays;

public class Solution {
    
    /*
     * array = [1,2,3,4,5,6]
     * put last element in a temporary variable, say temp = 6. this will create an empty space at last position
     * starting from 2nd last element --- till ---- first element move each one step further.
     * this will create a void space at starting position.
     * put the last element from temp variable to 0th position.
     */

     public static int[] rotate(int [] arr){
        int temp = arr[arr.length - 1];
        for(int i = arr.length - 2; i >= 0; i--){
            System.out.println(arr[i]);
            arr[i+1] = arr[i];
            System.out.println(arr[i+1]);
        }
        arr[0] = temp;
        return arr;
     }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(rotate(arr)));
    }
}
