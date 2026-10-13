package StructuralPatterns.AdapterPattern;

public class LegacyEmailService implements NotificationService{

    @Override
    public void send(String to, String sub, String content) {
        System.out.println("sending to : " + to
        + "\n Subject is : " + sub +
                "\n and The Content is : " + content);
    }
}
