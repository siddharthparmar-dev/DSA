package com.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateArrayByK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        //rotate(arr,3);
        rotate2(arr,5);

    }
    static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] temp = Arrays.copyOf(nums, k);
        for(int i = k; i < n; i++){
            nums[i-k] = nums[i];
        }
        int index = 0;
        for(int i = n-k; i < n; i++){
            nums[i] =  temp[index++];
        }
        System.out.println(Arrays.toString(nums));
    }

    static void rotate2(int[] nums, int k) {
        int n = nums.length;
        k = k % nums.length;

        reverse(nums, 0, n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);

        System.out.println(Arrays.toString(nums));
    }

    static void reverse(int[] nums,int start,int end) {
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
