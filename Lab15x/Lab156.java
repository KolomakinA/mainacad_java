package com.mainacademy.lessons.lesson1;

import java.util.Scanner;

public class Lab156 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = scanner.nextInt();
        String numberS = String.valueOf(x);
        int[] intArray = new int[numberS.length()];
        int sum = 0;

        for (int i = 0; i <intArray.length ; i++) {
            intArray[i]=Character.getNumericValue(numberS.charAt(i));
            sum = sum + (int)Math.pow(intArray[i],2);
        }

        System.out.println(String.format("The sum of squares of digits of \"%s\" equals to %s", x, sum));
    }
}
