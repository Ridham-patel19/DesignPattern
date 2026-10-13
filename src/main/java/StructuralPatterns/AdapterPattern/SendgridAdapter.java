package StructuralPatterns.AdapterPattern;

public class SendgridAdapter implements NotificationService{


    private SendgridEMailService service;

    public SendgridAdapter(SendgridEMailService service) {
        this.service = service;
    }

    @Override
    public void send(String to, String sub, String content) {
  service.sendFromSendgrid(to , sub , content);
    }
}
