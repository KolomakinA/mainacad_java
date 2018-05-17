package com.company.Lab16x;

public class Lab161 {
    public static void main(String[] args) {
        int[] ints = new int[15];
        int index = 0;
        for (int i = 1; i <= 30; i++) {
            if (i%2 == 0) {
                ints[index]=i;
                System.out.println(ints[index]);
                index ++;
            }
        }
    }
}
