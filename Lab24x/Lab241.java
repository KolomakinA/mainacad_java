package com.company.Lab24x;

import java.util.Arrays;

public class Lab241 {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,8};
        
        System.out.println(MyMath.findMin(arr1));
        System.out.println(MyMath.findMax(arr2));
    }
}

class MyMath{
    public static int findMin(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }

    public static int findMax(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
