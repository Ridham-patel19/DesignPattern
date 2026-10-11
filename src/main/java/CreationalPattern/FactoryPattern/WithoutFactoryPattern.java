package CreationalPattern.FactoryPattern;

interface vehicle{
    void Deleiver();
}


class Car implements vehicle{

    @Override
    public void Deleiver() {
        System.out.println("its a Car");
    }
}

class Bus implements vehicle{

    @Override
    public void Deleiver() {
        System.out.println("its a Bus");
    }
}

public class WithoutFactoryPattern {

    //this is a client now we are asking for specific object
    public static void main(String[] args) {
         vehicle car = new Car();
         vehicle bus = new Bus();

         //now client is directly interracting with object its tightly coupled
        //whicch is bas
        //lso if we have to add new vehivle then we have to add that ibject to this client code
         car.Deleiver();
         bus.Deleiver();
    }
}
