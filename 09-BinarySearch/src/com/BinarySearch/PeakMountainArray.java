package com.BinarySearch;

public class PeakMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,4,7,9,12,8,6,3,1};
        System.out.println(peakIndexInMountainArray(arr));
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

}
