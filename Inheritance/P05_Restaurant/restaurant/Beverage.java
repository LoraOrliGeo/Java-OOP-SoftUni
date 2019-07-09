package Inheritance.P05_Restaurant.restaurant;

import java.math.BigDecimal;

public class Beverage extends Product {
    private double milliliters;

    public Beverage(String name, BigDecimal price, double milliliters) {
        super(name, price);
        this.milliliters = milliliters;
    }

    public double getMilliliters() {
        return this.milliliters;
    }

    public void setMilliliters(double milliliters) {
        this.milliliters = milliliters;
    }
}
