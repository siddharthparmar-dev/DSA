package com.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {5,7,9,12,8,17,6,19,28,41,27,24};
        System.out.println(largest(arr));
    }

    static int largest(int[] arr){
        int maxval = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (maxval < arr[i]){
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
