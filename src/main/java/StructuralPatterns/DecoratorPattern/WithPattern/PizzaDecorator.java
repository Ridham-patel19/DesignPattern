package StructuralPatterns.DecoratorPattern.WithPattern;

import StructuralPatterns.DecoratorPattern.WithoutPattern.Pizza;

public abstract class PizzaDecorator implements Pizza1{

    private Pizza1 pizza;

    public PizzaDecorator(Pizza1 pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getPrice() {
        return pizza.getPrice();
    }

    @Override
    public String getDesc() {
        return pizza.getDesc();
    }
}
