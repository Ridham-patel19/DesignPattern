package StructuralPatterns.DecoratorPattern.WithoutPattern;

public class CheesePizza extends BasicPizza {

    @Override
    public int getPrice() {
        return super.getPrice() + 150;
    }

    @Override
    public String getDesc() {
        return super.getDesc() + "With cheese";
    }
}
