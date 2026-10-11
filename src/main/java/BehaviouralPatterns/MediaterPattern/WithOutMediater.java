package BehaviouralPatterns.MediaterPattern;


class User{

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message , User user){
        System.out.println(this.name + " has send the message  " + message + "to " + user.name );
    }
}
public class WithOutMediater {

    public static void main(String[] args) {

        User rp = new User("Rp");
        User dev = new User("dev");
        User vk = new User("vk");


        rp.sendMessage("HEllO " , dev);
        rp.sendMessage("hello ", vk);



    }


}


//now lets say we have chat application and where in send message we can have a LL THE CODE FOR THAT AND WE
//can have  recive messag etoo but the problem is now all user know each other and also
//its hard to main tain so its a bad code