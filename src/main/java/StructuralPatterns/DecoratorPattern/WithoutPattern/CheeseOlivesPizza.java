package StructuralPatterns.DecoratorPattern.WithoutPattern;

public class CheeseOlivesPizza extends CheesePizza{

    @Override
    public String getDesc() {
        return super.getDesc() + " added Olive";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 100;
    }
}
