package annotations.dependecyinjection;

public class EmailService implements MessageService {
    @Override
    public void send(String message) {
        System.out.println("*** Email Service ***");
        System.out.println(message);
    }
}
