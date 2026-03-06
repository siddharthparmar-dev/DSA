package com.BinarySearch;

public class RotatedSortedArrayII {
    public static void main(String[] args) {
        int[] nums = {2,5,6,0,0,1,2};
        int index = search(nums,0);
        if (index != -1){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
    static int search(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target == arr[mid]){
                return mid;
            }

            if(arr[start] == arr[mid] && arr[end] == arr[mid]){
                start++;
                end--;
            }
            else if (arr[start] <= arr[mid]){
                if (arr[start] <= target && target < arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
                if(arr[mid] > target && target <= arr[end]){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
