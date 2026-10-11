package BehaviouralPatterns.IteratorPAttern.WIth;

public class WithIteratorPattern {
    public static void main(String[] args) {
        CarCollection collection = new CarCollection();

        collection.addCar(new Car("BMW"));
        collection.addCar(new Car("Audi"));

         Iteratore<Car>  cars = collection.createIterator();

        while(cars.hasNext()){
            System.out.println(cars.next());
        }
    }
}

//
//now here you can see taht if in future if we chnage the data structure then
//we just have to chnage intertaor logic in that interatorCar class client doenot have to chnag eanything
