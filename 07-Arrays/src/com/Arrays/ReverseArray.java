package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int[] arr = new int[input.nextInt()];
        System.out.println("Enter the elements inside array:");
        for (int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        reverse(arr);
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            SwapValues(arr,start,end);
            start++;
            end--;
        }
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
    static void SwapValues(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
