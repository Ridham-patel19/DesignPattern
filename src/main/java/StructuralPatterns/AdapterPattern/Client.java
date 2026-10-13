package StructuralPatterns.AdapterPattern;

public class Client {

    public static void main(String[] args) {

        //here we are using legacy email system where we  have this Notifictaion service
        //now lets say in future we shift to new emial service which is better
        //lets say send grid but it has not same interface so interface is incompitible
        //so heere we can use adapter pattern
        NotificationService email = new LegacyEmailService();

        email.send("dev" , "Laptop" , "Laptop recived");

        //now we got new service
//        email = new SendgridEMailService();
        //but the interface is incompitible that is why we can not use it  and here we are using it manually other wise
        //in actuall production this object is going to pass from Di somethis
        //so for new send grid we have to chnage lts in this client class which is wrong
        //so lets create adapter class which wrap this sendgrid method so we can use it NotificatoonService

//        so now lets us ethat adapter classs

        email = new SendgridAdapter(new SendgridEMailService());


        // now we can use this from same interface so now we just have to pass this adapter class object
        //instead of old email service object
        email.send("dev" , "Laptop" , "Laptop recived sending from sendgrid");


    }
}
