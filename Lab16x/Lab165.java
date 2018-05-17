package com.mainacademy.lessons.lesson2;

import java.util.Arrays;

public class Lab155 {
    public static void main(String[] args) {
        int [][] multiDimArray = {{1,5,9,13},{2,6,10,14},{3,7,11,15},{4,8,12,16}};
        System.out.println("Original array:");
        System.out.println(Arrays.toString(multiDimArray[0])
                + "\n" + Arrays.toString(multiDimArray[1])
                + "\n" + Arrays.toString(multiDimArray[2])
                + "\n" + Arrays.toString(multiDimArray[3]));

        int [][] transposedArray = Arrays.copyOf(multiDimArray,4);

        for (int i = 0; i < multiDimArray.length; i++) {
            for (int j = 0; j < multiDimArray[i].length; j++) {
                transposedArray[i][j] = multiDimArray[j][i];
            }
        }

        System.out.println("Transposed array: ");
        System.out.println(Arrays.toString(transposedArray[0])
                + "\n" + Arrays.toString(transposedArray[1])
                + "\n" + Arrays.toString(transposedArray[2])
                + "\n" + Arrays.toString(transposedArray[3]));

    }


}
