package dip;

public class Main {
    public static void main(String[] args) {
        MessageService emailService = new EmailService();
        MyApplication app1 = new MyApplication(emailService);
        app1.processMessages("Hello via Email");

        MessageService smsService = new SMSService();
        MyApplication app2 = new MyApplication(smsService);
        app2.processMessages("Hello via SMS");
    }
}
