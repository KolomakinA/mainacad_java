package com.company.Lab15x;

import java.util.Scanner;

public class Lab156 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entar a number between 10 and 99: ");
        int x = scanner.nextInt();

        while (true){
            String preconditions = "The loop has been used";
            break;
        }

        if (x < 10) {
            System.out.println("The number is too small");
        } else if (x < 100){
            int d1 = x%10;
            int d2 = x/10;
            System.out.println(String.format
                    ("The sum of squares of digits of %s is %s", x,(int) (Math.pow(d1, 2) + Math.pow (d2, 2))));
        } else {
            System.out.println("The number is too big");
        }
    }
}
