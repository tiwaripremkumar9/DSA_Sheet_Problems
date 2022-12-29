package MaximumSubarraySum;

import java.util.Arrays;

public class Solution {
    
    /*
     * arr - [2,4,1,6,9,3,7]
     * if the array consist of all positive elements, then the maximum sum subarray is obviously the whole array
     * this problem is the "problem" when we the array will consist of negative elements.
     * for example array - [5,-4,-2,6,-1]
     * explanation - https://www.youtube.com/watch?v=HCL4_bOd3-4&t=617s
     * also called as Kadane's Algorithm
     */

     public static int maxSubArraySum(int [] arr){
        int currentSum = 0;
        int maxSum = 0;
        for(int i=0; i < arr.length; i++){
            currentSum = currentSum + arr[i];
            if(maxSum < currentSum)
                maxSum = currentSum;
            if(currentSum < 0)
                currentSum = 0;
        }
        return maxSum;
     }

    public static void main(String[] args) {
        //int [] arr = {5,-4,-2,6,-1};
        int [] arr = {5,-6,3,11,22,-9,-1,4,7};
        System.out.println(maxSubArraySum(arr));
    }
}
