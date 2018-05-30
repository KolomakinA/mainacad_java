package com.company.Lab25x;

public class Lab251 {
    public static void main(String[] args) {
        MyInitTest myInitTest = new MyInitTest();
    }

}
class MyInitTest{
    public MyInitTest()
    {
        this(5);
        System.out.println("Default constructor");
    }

    public MyInitTest(int i)
    {
        System.out.println("Parametrised constructor: " + i);
    }

    {
        System.out.println("non-static initialization block 1");
    }
    {
        System.out.println("non-static initialization block 2");
    }

    static {
        System.out.println("static initialization block 1");
    }
    static {
        System.out.println("static initialization block 2");
    }

}
