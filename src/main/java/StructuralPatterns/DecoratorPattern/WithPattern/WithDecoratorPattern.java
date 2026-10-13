package StructuralPatterns.DecoratorPattern.WithPattern;

import StructuralPatterns.DecoratorPattern.WithoutPattern.BasicPizza;
import StructuralPatterns.DecoratorPattern.WithoutPattern.CheesePizza;
import StructuralPatterns.DecoratorPattern.WithoutPattern.Pizza;

public class WithDecoratorPattern {

    public static void main(String[] args) {
        Pizza1 pizza = new BasicPizza1();

        System.out.println( pizza.getDesc());
        System.out.println( pizza.getPrice());

        pizza = new CheeseDecorator(pizza);
        pizza = new OliveDecorator(pizza);

        System.out.println( pizza.getDesc());
        System.out.println( pizza.getPrice());

        // as you can see that here we have abstract clas which holds the Pizza obj an dwe can add thing
        //and return new Pizza object where this decorator class will extends abstarct class
        //and willl take current pizza object and add amount according to decorator
        //now we can use as much decorator as we want to
        //it scalable + follows single resposibility cuz back there CheesePizza is making pizz and adding Chees
        //and here its just adding cheese
        //easy to maintain
    }
}
