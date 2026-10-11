package BehaviouralPatterns.Startergy_Pattern.BaddCode;



 class PetrolEngine{
     public void engine(){
         System.out.println("Petrol engine is made");

     }
 }
class DieselEngine {
    public void engine(){
        System.out.println("Diesel engine is made");

    }
}

class car{
    public  void BuildEngine(String Engine){
        if(Engine == "Petrol"){
           PetrolEngine engine = new PetrolEngine();
           engine.engine();

        }else{
            DieselEngine engine = new DieselEngine();
            engine.engine();
        }
    }
}
public class StratergyBadCode {
     public static void main (String[] args){
         car car1 = new car();
         car1.BuildEngine("Petrol");
     }
}


//now  here is it totally depends on this all class and now lets we have to
//scale this and want to add hydrogen or electrcal engine then we have to modify
// the method which is wrong so we can stratergy pattern here