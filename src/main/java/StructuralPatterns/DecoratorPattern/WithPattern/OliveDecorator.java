package StructuralPatterns.DecoratorPattern.WithPattern;

import StructuralPatterns.DecoratorPattern.WithoutPattern.Pizza;

public class OliveDecorator extends PizzaDecorator{
    public OliveDecorator(Pizza1 pizza) {
        super(pizza);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 100;
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " added olives";
    }
}
