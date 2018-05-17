package com.company.Lab16x;

import java.util.Arrays;
import java.util.Scanner;

public class Lab164 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] ints = new int[16];
        for (int i = 0; i < ints.length; i++) {
            System.out.print(String.format("Enter the %s element of the array: ", i));
            ints[i] = scanner.nextInt();
        }

        Arrays.sort(ints);
        System.out.print("\nEnter a number to find in the array: ");
        int searchRequest = scanner.nextInt();
        System.out.println(String.format("\nThe requested number is located at the %s position in the sorted array.",
                Arrays.binarySearch(ints, searchRequest)));

    }
}
