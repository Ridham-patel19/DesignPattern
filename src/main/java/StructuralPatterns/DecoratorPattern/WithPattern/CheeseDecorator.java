package StructuralPatterns.DecoratorPattern.WithPattern;

import StructuralPatterns.DecoratorPattern.WithoutPattern.Pizza;

public class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza1 pizza) {
        super(pizza);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " Added Cheese";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 100;
    }
}
