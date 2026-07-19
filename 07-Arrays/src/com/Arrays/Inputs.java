package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
//        arr[0] = 36;
//        arr[1] = 12;
//        arr[2] = 27;
//        arr[3] = 48;
//        arr[4] = 78;
//        System.out.println(arr[3]);

        // Taking inputs using for loop
        for (int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        // Print using for loop
//        for (int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }


//        //syntax:

//        for (dataType variable : collection) {
//            // code
//        }

        for (int num : arr){  // num stores every element in array
            System.out.println(num + " "); // for every element in array print the element
        }

//        System.out.println(arr[5]);
        // index out of bound error

        //print string using toString():
//        System.out.println(Arrays.toString(arr));
        // output: [45, 54, 65, 45, 65]

        //modify
//        arr[1] = 78;
        System.out.println(Arrays.toString(arr));
        //[45, 78, 89, 75, 86]
    }
}
