package com.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListForLoop {
    public static void main(String[] args) {
        ArrayList<Integer> newList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

// to add items inside ArrayList using for loop:

        for (int i = 0; i < 5; i++){
            System.out.println("enter the value to add: ");
            newList.add(input.nextInt());
        }

//  to print ArrayList using for loop:

        for (int i = 0; i < 5; i ++){
            System.out.println("Enter the index position: ");
            System.out.println(newList.get(input.nextInt()));
        }
    }
}
