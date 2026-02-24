package com.BinarySearch;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {87, 12, 45, 99, 3, 56, 78, 23, 67, 1,};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr,12));
    }
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
           // int mid = start + end / 2;   // for taking out middle value

            // start + end can go out of int range so we will control overflow

            int mid = start + (end - start) / 2;  // to control overflow
            // Eg:
            // 4 + 18 / 2 = 11
            // 4 + (18 - 4) / 2 = 4 + 7 = 11

            if (arr[mid] == target)   // if middle element == target then target found, return mid
            {
                return mid;
            }
            else if (arr[mid] < target)  // if value of arr[mid] < target , so we have to search in right side
            {
                start = mid +1;          // so we will make start index at next index pos of mid i.e. mid + 1;
            }
            else {                       //
                end = mid - 1;
            }
        }
        return -1;
    }
}
