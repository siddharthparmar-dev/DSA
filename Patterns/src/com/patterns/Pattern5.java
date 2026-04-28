package com.patterns;

public class Pattern5 {
    public static void main(String[] args) {
        pattern5(5);
    }
    static void pattern5(int n){
        for (int row = 1; row <= 2*n; row++) {
            if (row <= n){
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }
            }else {
                for (int col = row+1; col <= 2*n ; col++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
