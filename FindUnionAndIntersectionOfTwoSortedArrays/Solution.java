package FindUnionAndIntersectionOfTwoSortedArrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static int []  unionUsingSets(int [] arr1, int [] arr2){
        Set<Integer> set = new HashSet<Integer>();
        int k = 0;
        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int j = 0; j < arr2.length; j++){
            set.add(arr2[j]);
        }
        int l = set.size();
        int [] result = new int[l];
        for (int element : set) {
            result[k++] = element;
        }
        return result;
    }

    
    public static void main(String[] args) {
        int [] arr1 = {1,4,5,7,8,9};
        int [] arr2 = {2,3,5,6,7,9};
        System.out.println(Arrays.toString(unionUsingSets(arr1, arr2)));
    }
}
