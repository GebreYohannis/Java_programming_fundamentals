package annotations.dependecyinjection;

public class SMSService implements MessageService {
    @Override
    public void send(String message) {
        System.out.println("*** SMS Service **");
        System.out.println(message);
    }
}
