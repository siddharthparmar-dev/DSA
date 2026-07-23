package com.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] nums = {9,8,7,2,9,2,7,8,3,8};
        System.out.println(secondLargestElement(nums));

    }
    static int secondLargestElement(int[] nums) {
        int largest =  Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int num : nums){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }
}
