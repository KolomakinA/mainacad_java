package com.company.Lab24x;

//        The value of π can be calculated with the series:
//        π = 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + ...
//        Write a class MyCalc with public static method
//        calcPi(int) that takes as parameter an integer n, and
//        computes and returns the value of π approximated
//        to the first n terms of the series.

public class Lab245 {
    public static void main(String[] args) {
        System.out.println(MyCalc.calcPi(1000000000));
    }
}

class MyCalc{
    public static double calcPi(int n){
        double result = 4;
        int increment = 3;
        for (int i = 0; i < n ; i++) {
            if(i % 2 == 0) result = result - (double)4/increment;
            else if(i % 2 != 0) result = result + (double)4/increment;
            increment += 2;
        }
        return result;
    }
}
