package com.BinarySearch;

public class SplitArray {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        System.out.println(splitArray(arr,2));
    }
    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
                start = Math.min(start,nums[i]);
                end += nums[i];
        }

        //binary search

        while (start < end){
            int mid = start + (end - start) / 2;
            int partitions = countPartitions(nums,mid);
            if (partitions > k){
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return end;
    }
    static int countPartitions(int[] arr,int maxSum){
        int sum = 0;
        int partitions = 1;
        for (int num : arr){
            if (sum + num <= maxSum){
                sum += num;
            }
            else {
                sum = num;
                partitions++;
            }
        }
        return partitions;
    }
}
