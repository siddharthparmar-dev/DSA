package com.string;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); //195 //'' is used for characters
        // acii value of a is 97 and b is 98
        System.out.println("a" + "b"); //ab // " " is used for string
        System.out.println((char)('a' + 3));
        System.out.println("sid" + new ArrayList<>()); //sid[]
    }
}
