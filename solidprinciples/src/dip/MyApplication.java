package dip;

public class MyApplication {
    private MessageService messageService;

    public MyApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessages(String message) {
        messageService.sendMessage(message);
    }
}
