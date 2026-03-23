package com.BinarySearch;

import java.util.Arrays;

public class FirstLastOccurrence {

    public static void main(String[] args) {
        int[] arr = {2,3,4,4,5,6,7,8,8,8,9,10};
        int[] ans = {first(arr,8), last(arr,8)};
        System.out.println(Arrays.toString(ans));
    }

    static int first(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target == nums[mid]){
                ans = mid;
                end = mid - 1;   // move left
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }

    static int last(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target == nums[mid]){
                ans = mid;
                start = mid + 1;   // move right
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
}