package StructuralPatterns.DecoratorPattern.WithoutPattern;

public class WithoutDecorator {

    public static void main(String[] args) {
        Pizza pizza = new BasicPizza();
        pizza = new CheesePizza();
        System.out.println(pizza.getDesc());
        System.out.println(pizza.getPrice());

        //now  here with decorator pattern you can see that you have to create multiple class cuz
        //you have to ad soemthid object and return new object also there can be N num of Topings
        //from that we can create 2 rais to N num of patterns
        //leads to subclass explosion
        //scalability issue
        // its not dynamic
    }
}
