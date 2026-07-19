package com.string;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            stringBuilder.append(ch);
        }
        System.out.println(stringBuilder); //abcdefghijklmnopqrstuvwxyz
        System.out.println(stringBuilder.toString()); //abcdefghijklmnopqrstuvwxyz

        stringBuilder.deleteCharAt(2);
        System.out.println(stringBuilder); //abdefghijklmnopqrstuvwxyz

        stringBuilder.reverse();
        System.out.println(stringBuilder); //zyxwvutsrqponmlkjihgfedba
    }
}
