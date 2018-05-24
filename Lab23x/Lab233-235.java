package com.company.Lab23x;

public class Lab231 {
    public static void main(String[] args) {
        MyWindow[] windowsArray = new MyWindow[4];
        windowsArray[0] = new MyWindow(15.15, 87.8, 8, "transp" , false);
        windowsArray[1] = new MyWindow(45.5,45.9);
        windowsArray[2] = new MyWindow(75.5,654.5,6);
        windowsArray[3] = new MyWindow();

        for (MyWindow window:windowsArray) window.printFields();
    }
}

class MyWindow{
    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;

    public MyWindow() {
        this.width = 65.5;
        this.height = 78.1;
        this.numberOfGlass = 5;
        this.color = "blue";
        this.isOpen = true;
    }

    public MyWindow(double width, double height) {
        this();
        this.width = width;
        this.height = height;
    }

    public MyWindow(double width, double height, int numberOfGlass) {
        this();
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
    }

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
