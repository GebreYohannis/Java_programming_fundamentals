package network.urls;

public class User {
    private final int id;
    private String firstName;
    private String lastName;
    private final String email;

    public User(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{ id: " + getId() +
                ", firstName: " + getFirstName() +
                ", lastName: " + getLastName() +
                ", email: " + getEmail() + " }";
    }
}
