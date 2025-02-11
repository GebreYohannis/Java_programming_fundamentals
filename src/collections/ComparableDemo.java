package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public static void show() {
        List<User> users = new ArrayList<>();
        users.add(new User("B"));
        users.add(new User("A"));
        users.add(new User("C"));
        Collections.sort(users);
        System.out.println("Users After Sorted: " + users);
    }
}
