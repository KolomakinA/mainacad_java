package com.company.Lab25x;

import java.util.Random;

public class Lab252 {
    public static void main(String[] args) {
        MyInit i1 = new MyInit();
        MyInit i2 = new MyInit();
        i1.printArray();
        i2.printArray();
    }

}

class MyInit{
    //private int[] arr = new int[10];
    private static int[] arr = new int[10];

    /*{
        Random r = new Random();
        for (int i = 0; i < this.arr.length; i++) {
            this.arr[i] = r.nextInt();
        }
    }*/
    
    static {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
        }
    }

    public void printArray(){
        for (int number:arr) {
            System.out.print(number + ",");
        }
        System.out.println();
    }
}
