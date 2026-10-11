package BehaviouralPatterns.Observer_Pattern.GoodCode;

import java.util.ArrayList;
import java.util.List;

class WeatherMachine implements Subject {
    private float temprature;
    private List<Observer> observers;

    public void setTemprature(float temprature) {
        this.temprature = temprature;
    }

    public WeatherMachine() {
        observers = new ArrayList<Observer>();

    }


    @Override
    public void Attach(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void Detach(Observer obs) {
        observers.remove(obs);
    }

    @Override
    public void notifyObserver() {
        for (Observer obs : observers) {
            obs.Notify(temprature);
        }
    }
}
