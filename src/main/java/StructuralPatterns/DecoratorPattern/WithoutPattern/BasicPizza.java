package StructuralPatterns.DecoratorPattern.WithoutPattern;

public class BasicPizza implements Pizza{


    @Override
    public String getDesc() {
        return "BasicPizza";
    }

    @Override
    public int getPrice() {
       return 400;
    }
}
