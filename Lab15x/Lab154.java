package com.company.Lab15x;

public class Lab154 {
    public static void main(String[] args) {
        int counter = 0; //counter of matches, as soon as it equals 10 the program terminates
        for (int i = 1; i < 301; i++) {
            if (isDivisionResultEven(i)){
                System.out.println(i);
                counter++;
            }
            if (counter > 9) break;
        }
    }

    static boolean isDivisionResultEven(int x){
        return ((x%3) == 0 || (x%4) == 0);
    }
}
