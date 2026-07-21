package com.Arrays;

import java.util.Arrays;

public class MoveZeros {
    static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void moveZeroes(int[] nums) {
        int n = nums.length;
        int k = 0;
        for(int i=0;i<n;i++){
            if(nums[i] != 0){
                nums[k] = nums[i];
                nums[i] = 0;
                k++;
            }
        }
    }
}
