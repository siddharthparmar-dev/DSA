package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class input2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length); // no of rowa =  arr.length

        //for taking input of a 2d array using for loop

        //for accesing row:
        for (int row = 0; row < arr.length; row++){ //arr.length will take no of rows as length
            // for accessing columns:
            System.out.println("Enter the value inside SubArray at index pos:" + row);
            for (int col = 0; col < arr[row].length; col++){
                arr[row][col] = input.nextInt();
            }
        }

        // for printing 2d arrays
//        for (int row = 0; row < arr.length; row++){ //arr.length will take no of rows as length
//            // for accessing columns:
//            for (int col = 0; col < arr[row].length; col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        //enhanced for loop: for each loop
        for (int[] array: arr){
            System.out.println(Arrays.toString(array));
        }
        /*
        [1, 2, 3]
        [4, 5, 6]
        [7, 8, 9]
         */

    }
}
