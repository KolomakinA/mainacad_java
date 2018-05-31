package com.company.Lab27x;

public class Lab271 {
}

class Device{
    private String manufacturer;
    private float price;
    private String serialNumber;

    public Device() {
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return String.format("Manufacturer: %s; price = %s; Serial Number = %s",
                this.getManufacturer(),this.getPrice(),this.getSerialNumber());
    }
    
}

class Monitor extends Device {
    private int resolutionX;

    private int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super.setManufacturer(manufacturer);
        super.setPrice(price);
        super.setSerialNumber(serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return String.format("Manufacturer: %s; price = %s; Serial Number = %s; X = %s; Y = %s",
                this.getManufacturer(),this.getPrice(),this.getSerialNumber(),this.getResolutionX(),this.getResolutionY());
    }
}

class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super.setManufacturer(manufacturer);
        super.setPrice(price);
        super.setSerialNumber(serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String toString() {
        return String.format("Manufacturer: %s; price = %s; Serial Number = %s; Speed = %s; MAC = %s",
                this.getManufacturer(),this.getPrice(),this.getSerialNumber(),this.getSpeed(),this.getMac());
    }
}
