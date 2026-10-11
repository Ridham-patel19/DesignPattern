package BehaviouralPatterns.GoodCode;

interface Subject {
    void Attach(Observer obs);

    void Detach(Observer obs);

    void notifyObserver();
}
