package com.Leetcode;
// Leetcode Q no 9
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        System.out.println(palindrome(n));

    }
    static boolean palindrome(int x){
        int num = x;
        int reverse = 0;
        if (x < 0){
            return false;
        }
        while (x > 0){
            int lastDigit = x % 10;
            reverse = reverse * 10 + lastDigit;
            x = x / 10;
        }
        return (reverse == num);
    }
}