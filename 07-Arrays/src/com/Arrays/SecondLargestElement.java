package com.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] nums = {4,8,7,9,2,1,2,7,8,3,8};
        System.out.println(maximumElement(nums));

    }
    static int maximumElement(int[] arr){
        int max = arr[0];
        for(int i : arr){
            if (i > max)
                max = i;
        }
        return max;
    }
}
