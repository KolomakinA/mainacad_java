package com.company.Lab22x;

public class Lab225 {
    public static void main(String[] args) {
        A aFC = new A(5.5);
        A aR = new A(2,2.5);
    }

}

class A{
    public A(double r) {
        System.out.println(String.format("The square of a foursquare with a side %s equals to %s",r,r*r));
        System.out.println(String.format("The square of a circle with radius %s equals to %s",r,Math.PI*(r*r)));
    }

    public A(double a, double b) {
        System.out.println(String.format("The square of a rectangle with sides %s and %s equals to %s",a,b,a*b));
    }

    public A(final int a) {
        a = a*a;
        System.out.println("The result of assigning a square of a varialbe to a final variable is compilation error");
    }
}
