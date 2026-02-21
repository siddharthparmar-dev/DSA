package com.LinearSearch;

// Leetcode Q.no : 1295
public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {545,86,8794,1425,6,87,903,7545};
        System.out.println(findNumbers(arr));
    }

    //approach 1:
    // creating functions for counting digits and checking digits are even or not
//        static int findNumbers(int[] arr){
//        int count = 0;
//        for (int nums : arr){
//            if (even(nums)){
//                count++;
//            }
//        }
//        return count;
//        }
//
//     static boolean even(int n) {
//        int digits = countDigits(n);
//        if (digits % 2 == 0){
//            return true;
//        }
//        return false;
//    }
//
//    static int countDigits(int nums) {
//        int count = 0;
//        while (nums > 0){
//            nums /= 10;
//            count++;
//        }
//        return count;
//    }


    // approach 2:
    // using string conversion:
    // converting items of array into string and then using .length() to find out length
//    static int findNumbers(int[] arr){
//        int count = 0;
//        for (int nums : arr){
//            String str = Integer.toString(nums);
//            if (str.length() % 2 == 0){
//                count++;
//            }
//        }
//        return count;
//    }


    //approach 2:
    static int findNumbers(int[] arr){
        int count = 0;
        for (int n : arr){
            int c = 0;
            while (n > 0){
                n /= 10;
                c++;
            }
            if (c % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
