package com.BinarySearch;

public class MinimumInRotatedSorted {
    public static void main(String[] args) {
        int[] arr = {6,7,8,9,0,1,2,3,4,5};
        System.out.println(minimum(arr));
    }
    static int minimum(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int ans = Integer.MAX_VALUE;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[start] <= arr[mid]){
                ans = Math.min(ans,arr[start]);
                start = mid + 1;
            }
            else {
                ans = Math.min(ans,arr[mid]);
                end = mid - 1;
            }
        }
        return ans;
    }
}
