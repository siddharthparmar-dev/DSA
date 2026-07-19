package com.Arrays;

import java.util.Arrays;

public class PassingFunction {
    public static void main(String[] args) {
        int[] num = {45,25,69,13,78};
        System.out.println(Arrays.toString(num));
        changevalue(num);
        System.out.println(Arrays.toString(num));

    }
    static void changevalue(int[] arr){
        arr[0] = 100;
    }
}
