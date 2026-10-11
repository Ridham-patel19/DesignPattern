package BehaviouralPatterns.MediaterPattern;


import java.util.ArrayList;
import java.util.List;

class ChatUser{


    private ChatMediater mediater;
    private String name;

    public ChatUser(String name , ChatMediater mediater) {
        this.name = name;
        this.mediater = mediater;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void sendMessage(ChatUser  reciever , String message){
        mediater.sendTouser(this , reciever , message);
    }

    public void sendToAll(String msg){
        mediater.sendMessageToAll(this , msg);
    }

    public void reciveMsg(ChatUser sender , String msg){
        System.out.println(sender.getName() + " is sending a message to " + this.getName() + ": " + msg);

    }
}


interface ChatMediater{
    void addUser(ChatUser user);
    void sendMessageToAll(ChatUser sender , String msg);
    void sendTouser(ChatUser sender,ChatUser reciver , String msg);

}

class ChatRoom implements ChatMediater{
    private List<ChatUser> users  = new ArrayList<>();


    @Override
    public void addUser(ChatUser user) {
        users.add(user);
    }

    @Override
    public void sendMessageToAll(ChatUser sender , String msg) {
      for(ChatUser user : users){
          if(sender != user){
              user.reciveMsg(sender , msg);
          }
      }
    }

    @Override
    public void sendTouser(ChatUser sender , ChatUser reciver , String msg) {
        for(ChatUser user : users){
            if(reciver == user){
               user.reciveMsg(sender , msg);
            }
        }
    }
}
public class WithMediater {
    public static void main(String[] args) {
        ChatMediater chatRoom = new ChatRoom();
        ChatUser rp = new ChatUser("Rp" , chatRoom);
        ChatUser dev = new ChatUser("dev" , chatRoom);
        ChatUser vk = new ChatUser("vk" , chatRoom);

        chatRoom.addUser(rp);
        chatRoom.addUser(dev);
        chatRoom.addUser(vk);

        rp.sendToAll("Hello from Rp");
        rp.sendMessage(dev , "Laptop ordered successfully");
    }
}

//
//now in this what we canb see is we are using mediater between user to send messge
//        you can remove interface too but ChatRoom is main mediater here
//now all message are being send b no user is directly interacting other user
//its more about giving mdeium between any communication 