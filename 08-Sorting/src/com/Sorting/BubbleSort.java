package com.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {2,0,2,1,1,0};
//        int [] arr = {1,2,3,4,5,6};
        arr = bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
   static int[] bubbleSort(int[] arr){
        int n = arr.length;
       for (int i = 0; i < n; i++) {
           boolean isSwapped = false;
           for (int j = 1; j < n-i; j++) {
               if (arr[j] < arr[j-1]){
                   int temp = arr[j];
                   arr[j] = arr[j-1];
                   arr[j-1] = temp;
                   isSwapped = true;
               }
           }
          // System.out.println(isSwapped);
           if (!isSwapped){
               break;
           }
       }
       return arr;
   }
}
/*
Time complexity:
Best Case : O(N)
Worst case : O(N^2)
 */
