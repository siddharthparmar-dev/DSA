package com.Sorting;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {

    }
    static int findDuplicate(int[] nums) {
        int  n = nums.length;
        int i = 0;
        while (i < n){
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
            else{
                i++;
            }
        }

        for (int j = 0; j < n; j++) {
            
        }
    }
}
