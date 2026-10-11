package BehaviouralPatterns.GoodCode;

class Mobile implements Observer {

    @Override
    public void Notify(float temp) {
        System.out.println("Tempratuure in Mobile device is " + temp);
    }
}
