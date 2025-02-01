package generics;

public class TestUserCompare {
    public static void test() {
        var user1 = new User(30);
        var user2 = new User(20);
        // NB: We cannot use the equality operator (==) to compare two users
        if(user1.compareTo(user2) < 0)
            System.out.println("User1 < user2");
        else if (user1.compareTo(user2) == 0)
            System.out.println("user1 = user2");
        else
            System.out.println("user1 > user2");
    }
}
