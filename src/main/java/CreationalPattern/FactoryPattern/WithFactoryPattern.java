package CreationalPattern.FactoryPattern;

interface vehicle1{
    void Deleiver();
}


class Car1 implements vehicle1{

    @Override
    public void Deleiver() {
        System.out.println("its a Car");
    }
}

class Bus1 implements vehicle1{

    @Override
    public void Deleiver() {
        System.out.println("its a Bus");
    }
}

class VehicleFactory{
      public static vehicle1 getVehicle(String vehicle){
          switch(vehicle){
              case "car" :
                  return new Car1();

              case "bus" :
                  return new Bus1();
              default:
                  throw new IllegalArgumentException("No vehicle like this ");
          }
      }
}

public class WithFactoryPattern {
    public static void main(String[] args) {
         vehicle1 car = VehicleFactory.getVehicle("car");


         //now we are not directly interacting with vehicle or object creation
        //factory is abstracting thart from client
        //now if we have to add new vehicle we have to interact factory not the client
         car.Deleiver();
    }
}


//

//import java.util.HashMap;
//import java.util.Map;
//import java.util.function.Supplier;
//
//// 1. Common interface
//interface Notification {
//    void send(String message);
//}
//
//// 2. Concrete implementations
//class EmailNotification implements Notification {
//
//    @Override
//    public void send(String message) {
//        System.out.println("Email: " + message);
//    }
//}
//
//class SMSNotification implements Notification {
//
//    @Override
//    public void send(String message) {
//        System.out.println("SMS: " + message);
//    }
//}
//
//class PushNotification implements Notification {
//
//    @Override
//    public void send(String message) {
//        System.out.println("Push: " + message);
//    }
//}
//
//// 3. Factory
//class NotificationFactory {
//
//    private static final Map<String, Supplier<Notification>> registry =
//            new HashMap<>();
//
//    // Register a notification creator
//    public static void register(
//            String type,
//            Supplier<Notification> creator) {
//
//        registry.put(type.toLowerCase(), creator);
//    }
//
//    // Create the requested notification
//    public static Notification create(String type) {
//
//        Supplier<Notification> creator =
//                registry.get(type.toLowerCase());
//
//        if (creator == null) {
//            throw new IllegalArgumentException(
//                    "Unknown notification type: " + type);
//        }
//
//        return creator.get();
//    }
//}
//
//// 4. Client
//public class Main {
//
//    public static void main(String[] args) {
//
//        // Register available notification types
//        NotificationFactory.register(
//                "email", EmailNotification::new);
//
//        NotificationFactory.register(
//                "sms", SMSNotification::new);
//
//        NotificationFactory.register(
//                "push", PushNotification::new);
//
//        // Request objects from the factory
//        Notification n1 = NotificationFactory.create("email");
//        Notification n2 = NotificationFactory.create("sms");
//        Notification n3 = NotificationFactory.create("push");
//
//        // Use the objects
//        n1.send("Your order has shipped!");
//        n2.send("Your OTP is 123456");
//        n3.send("You have a new notification!");
//    }
//}
