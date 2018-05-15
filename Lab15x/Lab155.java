package com.company.Lab15x;

import java.util.Scanner;

public class Lab155 {
    public static void main(String[] args) {
        System.out.print("Fill in an upper bound of calculation \"n\": ");
        Scanner inputInt = new Scanner(System.in);
        int n = inputInt.nextInt();
        int summ = 0;
        int avg = 0;

        for (int i = 1; i <= n; i++) {
            summ = summ + i;
        }

        avg = summ / n;

        System.out.println(String.format("The summ of all integer numbers: %s", summ));
        System.out.println(String.format("The avarage integer number in the interval: %s", avg));
    }
}
