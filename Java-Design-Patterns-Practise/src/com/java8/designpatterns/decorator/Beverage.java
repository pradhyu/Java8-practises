package com.java8.designpatterns.decorator;

/**
 * Created by PKShrestha on 5/4/2017.
 */
public abstract class Beverage {
    Double cost;
    String description;

    public Double calculateCost() {
        return this.cost;
    }

    public String getDescription() {
        return this.description;
    }
}
