package com.recursion;

public class BSUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {14,21,24,27,29};
        System.out.println(search(arr,24,0,arr.length-1));
    }
    static int search(int[] arr,int target,int start,int end){
        if (start > end){
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target){
            return mid;
        }
        else if (arr[mid] < target){
            start = mid + 1;
        }
        else {
            end = mid - 1;
        }

        return search(arr,target,start,end);
    }
}
