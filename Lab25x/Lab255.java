package com.company.Lab25x;

import java.util.Random;

public class Lab255 {
    public static void main(String[] args) {
        InitTest initTest1 = new InitTest();
        InitTest initTest2 = new InitTest();
        InitTest initTest3 = new InitTest();
        InitTest initTest4 = new InitTest();
        InitTest initTest5 = new InitTest();

        System.out.println(initTest1.getId());
        System.out.println(initTest2.getId());
        System.out.println(initTest3.getId());
        System.out.println(initTest4.getId());
        System.out.println(initTest5.getId());
    }
}

class InitTest {
    private int id;
    private static int nextId;

    static {
        Random r = new Random();
        int random = 0;
        while (true){
            random = r.nextInt();
            if (random > 0 && random < 1001) break;
        }
        nextId = random;
    }

    public InitTest(){
        nextId++;
        id = nextId;
    }

    public int getId() {
        return id;
    }
}
