package com.company.Lab24x;

//Write a class MyPyramid with public static method printPyramid(int h)
//        that takes parameter an integer h between 1 and 9, and prints
//        a pyramid of numbers of height h. Example: For h = 4 the method
//        should print the pyramid
//    1
//   121
//  12321
// 1234321

public class Lab246 {
    public static void main(String[] args) {
        MyPyramid.printPyramid(10);
    }
}
class MyPyramid{
    public static void printPyramid(int h){
        for (int i = 1; i <= h; i++) {
            for (int j = h-i; j > 0 ; j--) {//Printing whitespaces
                System.out.print(" ");
            }

            for (int j = 1; j <i ; j++) {//inline printing increasing set of numbers, from 1 to h-1
                System.out.print(j);
            }
            
            System.out.print(i);//printing increment
            
            for (int j = i-1; j >= 1 ; j--) {//inline printing decreasing set of numbers, from h-1 to 1
                System.out.print(j);
            }
            
            System.out.println();
        }
    }
}
