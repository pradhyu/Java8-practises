package com.java8.designpatterns.decorator;

/**
 * Created by PKShrestha on 5/4/2017.
 */
public abstract class BeverageDecorator extends Beverage {
    protected Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public Double calculateCost() {
        return this.cost + beverage.calculateCost();
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " -> " + this.description;
    }
}
