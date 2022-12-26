package FindUnionAndIntersectionOfTwoSortedArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    public static int[] unionUsingMerge(int [] arr1, int [] arr2){
            int i = 0, j = 0;
            List<Integer> list = new ArrayList<>();
            while(i < arr1.length && j < arr1.length) {
                if(i == arr1.length){
                    list.add(arr2[j]);
                    j++;
                    continue;
                }
                if(j == arr2.length){
                    list.add(arr1[i]);
                    i++;
                    continue;
                }

                if(arr1[i] < arr2[j]){
                    list.add(arr1[i]);
                    i++;
                }
                if(arr1[i] > arr2[j]){
                    list.add(arr2[j]);
                    j++;
                }
                if(arr1[i] == arr2[j]){
                    list.add(arr2[j]);
                    i++;
                    j++;
                }
            }
            int k = 0;
            int [] arr = new int[list.size()];
            for (Integer each : list) {
                arr[k++] = each;
            }
            return arr;
    }

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
        System.out.println(Arrays.toString(unionUsingMerge(arr1, arr2)));
    }
}
