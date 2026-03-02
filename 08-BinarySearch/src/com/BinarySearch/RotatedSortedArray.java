package com.BinarySearch;

public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {5,1,3};
        int peak = pivotElement(arr);
        System.out.println(peak);
        int target = 3;
        int leftSide = search(arr,target,0,peak);
        if (leftSide != -1){
            System.out.println(leftSide);
        }
        int rightSide = search(arr,target,peak + 1,arr.length -1);
        System.out.println(rightSide);
    }
    static int pivotElement(int[] arr) {
        int max = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        return index;
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
