package BehaviouralPatterns.Startergy_Pattern.GoodCOde;

class PetrolEngine implements EngienType{
    public void engine(){
        System.out.println("Petrol engine is made");

    }
}
class DieselEngine implements EngienType {
    public void engine(){
        System.out.println("Diesel engine is made");

    }
}


interface EngienType{
    void engine();
}

class car{
    private EngienType _engine;


    public car(EngienType _engine) {
        this._engine = _engine;
        _engine.engine();
    }
}
public class StratergyPattern {

    public static void main(String[] args){
        DieselEngine engine = new DieselEngine();
        PetrolEngine engine2 = new PetrolEngine();
        car car1 = new car( engine);
        car car2 = new car(engine2);
    }

}
