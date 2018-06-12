package com.generics;

public class Main {
    public static void main(String[] args) {
        MyBox <Integer> mb = new MyBox<Integer>();
        mb.setT(Integer.valueOf(10));
        System.out.println(mb.getT());

        MyBox <String> mb2 = new MyBox<String>();
        mb2.setT("Hello!");
        System.out.println(mb2.getT());

        MyBox <MyBox> mb3 = new MyBox<MyBox>();
        System.out.println(mb3.getT());

}}

class MyBox <T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
