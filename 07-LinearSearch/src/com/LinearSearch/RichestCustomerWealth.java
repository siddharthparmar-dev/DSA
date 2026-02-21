package com.LinearSearch;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] arr = {{4,5,8},{8,7,3},{4,9,7}};
        System.out.println(maxWealth(arr));

    }
    static int maxWealth(int[][] accounts){
        int maximumWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int totalWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                totalWealth = totalWealth + accounts[i][j];
            }
            if (totalWealth > maximumWealth){
                maximumWealth = totalWealth;
            }
        }
        return maximumWealth;
    }
}
