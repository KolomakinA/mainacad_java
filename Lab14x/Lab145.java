package com.company.Lab14x;

public class Lab145 {
    public static void main(String[] args) {
        int a = -5;
        int b = 14;

        System.out.println(String.format("Bit shift: %s, multiplying: %s",a<<4, b*16));
        System.out.println(String.format("Bit shift: %s, dividing: %s",a>>2,b/32));
        System.out.println(String.format("Bit shift: %s, multiplying: %s",a>>>1,b*128));
    }
}
