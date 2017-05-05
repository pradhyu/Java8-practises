package com.java8.designpatterns.decorator;

/**
 * Created by PKshrestha on 5/4/2017.
 */
public class WhipCream extends BeverageDecorator {

    public WhipCream(Beverage beverage) {
        super(beverage);
        this.cost = 2D;
        this.description = "With WhipCream(" +this.cost +")";
    }

}
