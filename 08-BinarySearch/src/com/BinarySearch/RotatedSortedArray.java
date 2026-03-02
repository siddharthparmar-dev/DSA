package com.BinarySearch;

public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,5};
        int peak = peakIndexInMountainArray(arr);
        int target = 5;
        int leftSide = search(arr,target,0,peak);
        if (leftSide != -1){
            System.out.println(leftSide);
        }
        int rightSide = search(arr,target,peak + 1,arr.length -1);
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int search(int[] nums, int target,int start,int end) {
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (target == nums[mid]){
                return mid;
            }else if (target < nums[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
