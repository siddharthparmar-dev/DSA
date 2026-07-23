package com.Arrays;

public class ThirdLargestElement {
    static void main(String[] args) {
        int[] arr = {7,4,5,2,9,4,1,8,2,5,1,5,5,2,4,12,5,1,5,15,25,51,5,1,0,4};
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
                thirdLargest = secondLargest;
                secondLargest = num;
            }else if(num > thirdLargest && num != largest &&  num != secondLargest){
                thirdLargest = num;
            }
        }
        return thirdLargest;
    }
}
