package com.string;

public class string {
    public static void main(String[] args) {
        String a = "Sid";
        String b = "Sid";


//                              String pool
//  Inside heap memory, a String pool is created which contains objects of string type
//  If two or more varibles are having same values, then no extra object will be created inside string pool
//  all the ref. variables having same values will point to a single object inside heap (String pool)


//                              Immutablitiy

//  if we change the value of one refernce variable, then will it affect all the ref variable pointing towards
//  same object like array/list?

        //eg:
        int[] arr = {1,2,3,4,5};
        int[] arr2 = arr;

        System.out.println(arr2[0]);  // 1
        arr2[0] = 6;
        System.out.println(arr[0]); // 6

        // but in string it will not happen, because strings are immutable

        String c = "hello";
        String d = c;
        d = "hii";
        System.out.println(c); // hello
        System.out.println(d); // hii

        // no changes made because strings ae immutable
        // string are immutable in java


    }
}
