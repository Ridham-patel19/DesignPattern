package BehaviouralPatterns.GoodCode;

class PC implements Observer {

    @Override
    public void Notify(float temp) {
        System.out.println("Tempratuure in PC device is " + temp);
    }
}
