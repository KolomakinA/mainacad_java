package com.mainacademy.lessons.lesson2;

import java.util.Arrays;

public class Lab156 {
    public static void main(String[] args) {
        double [] avgTemp = {-5.4, -4.4, 0.5, 8.5, 15.3, 18.5, 20.4, 19.3, 14.5, 8.2, 1.8, -2.9};
        Arrays.sort(avgTemp);
        System.out.println(Arrays.toString(avgTemp));
    }
}
