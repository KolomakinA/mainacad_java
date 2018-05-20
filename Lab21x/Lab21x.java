package com.company.Lab21x;

import java.math.BigDecimal;

public class Lab211 {
    public static void main(String[] args) {
        Computer [] computers = new Computer[5];
        float price = 199.99F;

        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer("Dell", i+1, price
                    , 2,4);
        }

        for (Computer c:computers) {
            c.setPrice(price);
            price = round((float) (price * 1.1),2);
            c.view();
        }


    }

    public static float round(float d, int decimalPlace) {
        BigDecimal bd = new BigDecimal(Float.toString(d));
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
        return bd.floatValue();
    }
}

class Computer{
    final private String manufacturer;
    final private int serialNumber;
    private float price;
    final private int quantityCPU;
    final private int frequencyCPU;

    public Computer(String manufacturer, int serialNumber, float price, int quantityCPU, int frequencyCPU) {
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.price = price;
        this.quantityCPU = quantityCPU;
        this.frequencyCPU = frequencyCPU;
    }

    public void view (){
        System.out.println(String.format(
                "Manufacturer: %s; Serial: %s; CPU Quantity: %s; CPU's Frequency: %s; Price: %s",
                this.getManufacturer(),this.getSerialNumber(),this.getQuantityCPU(),this.getFrequencyCPU(),this.getPrice()));
    }

    public String getManufacturer() {
        return manufacturer;
    }


    public int getSerialNumber() {
        return serialNumber;
    }


    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }

    public int getFrequencyCPU() {
        return frequencyCPU;
    }
}
