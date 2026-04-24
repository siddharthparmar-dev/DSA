package com.string;

public class Palindrome {
    public static void main(String[] args) {
        String str = "sid";
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String string){
        int n = string.length();
        for (int i = 0; i < n/2; i++) {
            char start = string.charAt(i);
            char end = string.charAt(n-1-i);

            if (start != end){
                return false;
            }
        }
        return true;
    }
}
