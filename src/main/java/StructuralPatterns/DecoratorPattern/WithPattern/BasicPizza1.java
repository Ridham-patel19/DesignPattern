package StructuralPatterns.DecoratorPattern.WithPattern;

import StructuralPatterns.DecoratorPattern.WithoutPattern.Pizza;

public class BasicPizza1 implements Pizza1 {


    @Override
    public String getDesc() {
        return "BasicPizza";
    }

    @Override
    public int getPrice() {
       return 400;
    }
}
