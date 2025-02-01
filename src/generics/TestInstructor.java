package generics;

public class TestInstructor {
    public static void test() {
        User user = new User(12);
        User user1 = new Instructor(10);
        Instructor instructor = new Instructor(11);
        printUser(user);
        printUser(user1);
        printUser(instructor);

        var users = new GenericList<User>();
        printUsers(users);

//        Based on the following implementation we got a compilation error because
//        GenericList<Instructor> is not the subtype of GenericList<User> that is the reason.
//        However, you can solve this issue using wild card
        var instructors = new GenericList<Instructor>();
//        printUsers(instructors); // Compilation error

//        The above problem is solved with the following code

        printWithWildCard(users);
        printWithWildCard(instructors);
        printWithWildCard(new GenericList<String>());
        printWithWildCard(new GenericList<Integer>());
        printWithWildCard(new GenericList<>());

//        In the above case we can pass anything, but we can make more restrict as follows
        printResultWithRestrictWildCard(users);
        printResultWithRestrictWildCard(instructors);
        printResultWithRestrictWildCard(new GenericList<>());

//        Compilation error
//        printResultWithRestrictWildCard(new GenericList<Integer>());
//        printResultWithRestrictWildCard(new GenericList<String>());
    }

    private static void printUser(User user) {
        System.out.println(user);
    }

    private static void printUsers(GenericList<User> users){
    }

    private static void printWithWildCard(GenericList<?> obj) {
        Object o = obj;
    }

    private static void printResultWithRestrictWildCard(GenericList<? extends User> users) {
        Object o = users;
        User x = users.get(0);
    }

    private static void toWriteElementToTheListUseTheSuperKeyWordWithTheWildCard(GenericList<? super User> users){
        // The java compiler treats this (GenericList<? super User> users) as
        // GenericList<Object> users = new GenericList<>();
        users.add(new User(20));
        users.add(new Instructor(30));

        // to read from the list
        Object x = users.get(0); // OK
        // User y = users.get(0); // Compilation error because the java compiler
        // doesn't know where the user object is compatible with the Object class
        // that is the reason you need to use the extends keyword on the constraint to read an object from the list

    }

    private static void toReadElementFromTheListUseTheExtendsKeyWordWithWildCard(GenericList<? extends User> users){
        User x = users.get(0);
    }
}
