package StructuralPatterns.AdapterPattern;

public class SendgridEMailService {
    public void sendFromSendgrid(String to , String sub , String content){
        System.out.println("sending to : " + to
                + "\n Subject is : " + sub +
                "\n and The Content is : " + content);
    }
}

