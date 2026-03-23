package com.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr ={5,3,4,6,2};
        arr = bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] bubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                if (arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }
}
