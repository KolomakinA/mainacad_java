package com.company.Lab16x;

public class Lab163 {
    public static void main(String[] args) {
        int[][] twoDimArray = {{1, 5, 9, 13},{2, 6, 10, 14}, {3, 7, 11, 15},{4, 8, 12, 16}};

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if(twoDimArray[i][j] == 9) System.out.print(String.format("%s  ",twoDimArray[i][j]));
                else System.out.print(String.format("%s ",twoDimArray[i][j]));
            }
            System.out.println();
        }
    }
}
