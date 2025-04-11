package generics;
import java.util.UUID;
public class Customer {
    private UUID customerId;
    private String username;
    public Customer( String username) {
       this.customerId = UUID.randomUUID();
        this.username = username;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
}
