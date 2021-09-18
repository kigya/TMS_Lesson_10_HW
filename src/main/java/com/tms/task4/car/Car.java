package com.tms.task4.car;

public abstract class Car {

    private final String brand;
    private final String model;
    private final String color;
    private final int manufactureYear;
    private final int maxSpeed;
    private final int price;
    private final boolean awd;

    protected Car(String brand, String model, String color, int manufactureYear, int maxSpeed, int price, boolean awd) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.manufactureYear = manufactureYear;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.awd = awd;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public boolean isAwd() {
        return awd;
    }

}
