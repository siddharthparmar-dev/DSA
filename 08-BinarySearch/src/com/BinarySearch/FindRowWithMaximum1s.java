package com.BinarySearch;

public class FindRowWithMaximum1s {
    public static void main(String[] args) {
        int[][] mat = {
                {0,1,0},
                {0,1,1},
                {1,1,1},
                {0,0,0}
        };
        System.out.println(rowWithMax1s(mat));
    }
    static int rowWithMax1s(int[][] mat){
        int index = -1;
        int totalCount = 0;
        for (int i = 0; i < mat.length - 1; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length - 1; j++) {
                if (mat[i][j] == 1){
                    count++;
                }
            }
            if (totalCount < count){
                totalCount = count;
                index = i;
            }
        }
            return index;
    }
}
