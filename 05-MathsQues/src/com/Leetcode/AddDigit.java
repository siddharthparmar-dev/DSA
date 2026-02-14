package com.Leetcode;
// Leetcode Q no 258
import java.util.Scanner;

public class AddDigit {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        System.out.println(Result(num));
    }
   static int Result(int num){
       if(num == 0) return 0;
       else if(num % 9 == 0) return 9;
       else return num % 9;
   }
}
