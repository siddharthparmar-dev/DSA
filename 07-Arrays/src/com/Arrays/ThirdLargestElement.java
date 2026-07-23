package com.Arrays;

public class ThirdLargestElement {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(thirdMax(arr));

    }
    static int thirdMax(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        for (int num : nums) {
            if(num > largest){
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }else if(num > thirdLargest && num != largest &&  num != secondLargest){
                thirdLargest = num;
            }
        }
        return thirdLargest;
    }
}
