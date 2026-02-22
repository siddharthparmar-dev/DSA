package com.LinearSearch;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {7,8,5,6,2,1,4,7,3};
        System.out.println(Arrays.toString(twoSum(arr,12)));
    }
     static int[] twoSum(int[] nums, int target) {
         for (int i = 0; i < nums.length; i++) {
             for (int j = 1; j < nums.length - 1; j++) {
                 if (nums[i] + nums[j] == target){
                     return new int[]{i,j};
                 }
             }
         }
         return new int[] {};
    }
}
