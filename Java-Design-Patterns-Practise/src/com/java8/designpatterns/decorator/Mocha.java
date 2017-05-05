package com.java8.designpatterns.decorator;

/**
 * Created by PKshrestha on 5/4/2017.
 */
public class Mocha extends Beverage {

    public Mocha(Double cost) {
        this.cost = cost;
        this.description = "Mocha(" + this.cost + ")";
    }

}
