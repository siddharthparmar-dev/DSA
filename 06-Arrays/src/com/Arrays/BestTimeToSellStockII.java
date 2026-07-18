package com.Arrays;

public class BestTimeToSellStockII {
    static void main(String[] args) {
        int[] arr = {4,5,9,2,7};
        System.out.println(maxProfit(arr));
    }
    static int maxProfit(int[] prices) {
        int totalProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                totalProfit += prices[i] - prices[i - 1];
            }
        }
        return totalProfit;
    }

    static int maxProfit2(int[] prices) {}
}
