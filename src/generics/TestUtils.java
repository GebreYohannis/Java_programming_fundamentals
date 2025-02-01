package generics;

import generics.utils.Utils;

public class TestUtils {
    public static void test() {
        User user1 = new User(10);
        User user2 = new User(30);

        var max = Utils.max(user1,user2);
        System.out.println(max);

        Utils.print(1,user1);
        Utils.print(2,user2);
    }
}
