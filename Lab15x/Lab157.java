package com.mainacademy.lessons.lesson1;

import java.util.LinkedList;
import java.util.Scanner;

public class Lab157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (isPerfectNumber(i)) System.out.println(i);
        }
    }

    static boolean isPerfectNumber (int n){
        LinkedList <Integer> divisors = getDivisorsExceptItself(n);
        if (divisors.size() == 0) return false;
        int divisorsSum = 0;
        for (int i = 0; i < divisors.size(); i++) {
            divisorsSum = divisorsSum + divisors.get(i);
        }
        if (divisorsSum == n) return true;
        else return false;
    }

    static LinkedList getDivisorsExceptItself (int n){
        LinkedList <Integer> divisors = new LinkedList();
        for (int i = 1; i <= n ; i++) {
            if (n == i) continue;
            else if ((n % i) == 0) divisors.add(i);
        }
        return divisors;
    }
}
