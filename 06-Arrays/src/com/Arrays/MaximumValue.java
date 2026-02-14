package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int[] arr = new int[input.nextInt()];
        System.out.println("Enter the elements inside the array");
        for (int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int maxval = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (maxval < arr[i]){
                maxval = arr[i];
            }
        }
        System.out.println("MAXIMUM VALUE IS :" + maxval);
    }
}
