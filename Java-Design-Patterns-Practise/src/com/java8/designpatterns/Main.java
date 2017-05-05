package com.java8.designpatterns;

import com.java8.designpatterns.decorator.Beverage;
import com.java8.designpatterns.decorator.Mocha;
import com.java8.designpatterns.decorator.WhipCream;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        out.println("Simple demostration of Decorator pattern");
        out.println("Mocha costs 10$ and with whip cream 2$ more");
        Beverage beverage = new Mocha(10D);
        out.println(beverage.getDescription() + "::" + beverage.calculateCost());
        beverage = new WhipCream(beverage);
        out.println(beverage.getDescription() + "::" + beverage.calculateCost());
        beverage = new WhipCream(beverage);
        out.println(beverage.getDescription() + "::" + beverage.calculateCost());
    }
}
