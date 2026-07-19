package com.string;

public class Comparison {
    public static void main(String[] args) {
        String a = "sid";
        String b = "sid";
        System.out.println(a == b); //true
        // == will check if both the ref varibale are pointing towards same object or not

        // but if want to create diffrent objects then what we will we do
        // we will use the new keyword and by using new keyword diffrent objects will be created inside heap
        // they will be outside the pool

        String c = new String("Sid");
        String d = new String("Sid");
        System.out.println(c == d);  // false

        // this is not the optimized way of doing it so we will use sting pool

        System.out.println(c.equals(d)); //true

    }
}
