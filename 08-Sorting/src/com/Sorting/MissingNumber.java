package com.Sorting;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0,1,5,3,4,6};
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] nums){
        int n = nums.length;
        int i = 0;
        while (i < n){
            int index = nums[i];
            if (nums[i] < n && nums[i] != nums[index]){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
            else {
                i++;
            }
        }

        for (int index = 0; index < n; index++) {
            if (nums[index] != index){
                return index;
            }
        }
        return n;
    }
}
