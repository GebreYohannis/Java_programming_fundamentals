package annotations.dependecyinjection;

public class NotificationService {
   @InjectDependency
   private MessageService service;

    public void send(String message) {
        service.send(message);
    }
}
