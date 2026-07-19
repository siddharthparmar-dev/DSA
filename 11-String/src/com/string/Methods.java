package com.string;

import java.util.Arrays;
import java.util.Locale;

public class Methods {
    public static void main(String[] args) {
        String name = "Siddharth parmar";
        System.out.println(Arrays.toString(name.toCharArray()));
        //[S, i, d, d, h, a, r, t, h,  , p, a, r, m, a, r]
        System.out.println(name.toLowerCase());  //siddharth parmar
        System.out.println(name.toUpperCase());  //SIDDHARTH PARMAR
        System.out.println("     sid    ".strip());  //sid

    }
}
