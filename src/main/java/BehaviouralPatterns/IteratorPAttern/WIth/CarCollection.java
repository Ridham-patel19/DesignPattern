package BehaviouralPatterns.IteratorPAttern.WIth;

import java.util.ArrayList;
import java.util.List;
// this  pattern is used in side Java collection
// it will have nested class which will impelemnt the Iterator interface
// which will has cirtain logic according to data structure
public class CarCollection {
    private List<Car> cars = new ArrayList<>();




    public void addCar(Car car){
        cars.add(car);
    }



// this  emthod is returning object of car iterator class
    public Iteratore<Car> createIterator(){
        return new IteratorCar(this.cars);
    }

    class IteratorCar implements Iteratore<Car> {
        private int position  = 0 ;

         private List<Car> cars = new ArrayList<>();
        public IteratorCar(List<Car> cars) {
            this.cars = cars;
        }

        @Override
        public boolean hasNext() {
            return position < cars.size();
        }

        @Override
        public Car next() {
            return cars.get(position++);
        }
    }
    }
