package BehaviouralPatterns.Observer_Pattern.GoodCode;

public class ObserverPattern {
    public static class ObservesPattern {
        public static void main(String[] args){
            WeatherMachine wb = new WeatherMachine();
            Observer mobile = new Mobile();
            Observer pc = new PC();


            wb.Attach(mobile);
            wb.Attach(pc);
            wb.setTemprature(45);
            wb.notifyObserver();
            wb.Detach(mobile);
            wb.setTemprature(35);
            wb.notifyObserver();

        }
    }

}


