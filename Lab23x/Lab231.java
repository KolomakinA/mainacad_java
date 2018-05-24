package com.company.Lab23x;

public class Lab231 {
    public static void main(String[] args) {
        MyWindow myWindow1 = new MyWindow(15.15, 87.8, 8, "transp" , false);
        myWindow1.printFields();
        MyWindow myWindow2 = new MyWindow(45.5,45.9,5,"ff", true);
        myWindow2.printFields();
        MyWindow myWindow3 = new MyWindow(65.5,654.5,6,"fg",false);
        myWindow3.printFields();
        MyWindow myWindow4 = new MyWindow(56.7,96.7,5,"gr",true);
        myWindow4.printFields();
        MyWindow myWindow5 = new MyWindow(8557.6,685,5,"ololo", true);
        myWindow5.printFields();
    }
}
class MyWindow{
    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }
    public void printFields(){
        System.out.println(String.format("Width: %s, Height: %s, Number of glass: %s, Color: %s, State: %s",this.width,
                this.height, this.numberOfGlass, this.color, this.isOpen));
    }
}
