package com.Arrays;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumValueinRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int[] arr = new  int[input.nextInt()];
        System.out.println("Enter the elements inside ther array:");
        for (int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter the range to get Maximum value:");
        System.out.print("Enter start index:");
        int start = input.nextInt();
        System.out.print("Enter end index:");
        int end = input.nextInt();
        int maxValue = arr[start];

        for (int i = start; i <= end; i++ ){
            if (arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        System.out.println("Maximum value is " + maxValue);
    }
}
