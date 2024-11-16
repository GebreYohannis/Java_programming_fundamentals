package ControlFlow;

public class SwitchStatement {
    public static void doOperation() {
        String role = "Admin".toUpperCase();
        System.out.println(role);

        boolean isAdmin = role == "ADMIN"; // false cause the == operator compares the actual object reference not the
                                           // content
        isAdmin = role.equals("Admin"); // true compare the content;
        if (role.equals("ADMIN"))
            System.out.println("You are admin user");
        else if (role.equals("MODERATOR"))
            System.out.println("You are moderator user");
        else
            System.out.println("You are guest user.");

        // Switch

        switch (role) {
            case "ADMIN":
                System.out.println("You are admin user");
                break;
            case "MODERATOR":
                System.out.println("You are a moderator user");
            default:
                System.out.println("You are guest user");
                break;
        }
    }
}
