package com.company.Lab14x;

public class Lab141 {
    public static void main(String[] args) {

        byte aByte = 127;
        short aShort = 32000;
        int anInt = 320000000;
        long aLong = 320000000000000000L;
        float aFloat = 789456.4687358654F;
        double aDouble = 657654687.6876246876546687546546268766576265765467654;
        char aChar = '\u1275';
        boolean aBoolean = 0>0;

        System.out.println("Here we are: \n");
        System.out.println(String.format("byte: %s",aByte));
        System.out.println(String.format("short: %s",aShort));
        System.out.println(String.format("integer: %s",anInt));
        System.out.println(String.format("long: %s",aLong));
        System.out.println(String.format("float: %s",aFloat));
        System.out.println(String.format("double: %s",aDouble));
        System.out.println(String.format("char: %s",aChar));
        System.out.println(String.format("boolean: %s",aBoolean));
    }

}
