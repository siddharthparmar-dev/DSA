package com.LinearSearch;

public class LinearSearch {
    static int ls(int[] arr,int target){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return i;  //found element
            }
        }
        return -1; // not found element
    }
    public static void main(String[] args) {
    int[] array = {18,12,9,14,77,50};
    int target = 14;
    int result = ls(array,target);
    System.out.println("element found at index pos: " + result);
    }
}
