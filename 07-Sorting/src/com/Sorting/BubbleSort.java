package com.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {2,0,2,1,1,0};
        arr = bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] bubbleSort(int[] nums){
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            boolean swapped = false;
            for (int j = 1; j < n-i; j++) {
                if (nums[j-1] > nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
        return nums;
    }
}
