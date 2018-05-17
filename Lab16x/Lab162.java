package com.company.Lab16x;

public class Lab162 {
    public static void main(String[] args) {
        int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
        int aMaximum = m[0];
        int aMinimum = m[0];
        int aSum = 0;


        for (int month : m) {
            aSum = aSum + month;
            if (month > aMaximum) aMaximum = month;
            else if (month < aMinimum) aMinimum = month;
        }

        System.out.println(String.format("A maximal number in the provided array is: %s", aMaximum));
        System.out.println(String.format("A minimal number in the provided array is: %s", aMinimum));
        System.out.println(String.format("An average number in the provided array is: %s", aSum/m.length));
    }
}
