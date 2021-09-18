package com.tms.task4.car;

public class Sedan extends Car {

    public Sedan(String brand, String model, String color,
                 int manufactureYear, int maxSpeed, int price, boolean awd) {
        super(brand, model, color, manufactureYear, maxSpeed, price, awd);
    }

    @Override
    public String toString() {
        return "\n\n" + this.getBrand() + " " + this.getModel() + "\nType: Sedan" +
                "\nColor: " + this.getColor() + "\nManufacture year: " + this.getManufactureYear() +
                "\nMax speed: " + this.getMaxSpeed() + "mph\nPrice: " + this.getPrice() + "$\nAWD: " +
                (this.isAwd() ? "Yes\n" : "No\n") + "In garage";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
