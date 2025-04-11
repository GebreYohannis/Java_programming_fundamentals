package generics;

public class TestGenericList {
    public static void test() {
        GenericList<Customer> users = new GenericList<Customer>();
        users.add(new Customer("@dagmawit"));
        users.add(new Customer("@demisgech"));
        var user = users.get(0);

        GenericList<Integer> intNumbers = new GenericList<>();
        intNumbers.add(1);// This process is called Boxing (wrapping to)
        intNumbers.add(2);
        intNumbers.add(24);
        int number = intNumbers.get(2); // Unboxing( getting back)

//        In Generic type parameters you cannot store primitive types instead it only store reference type
//       All the followings cause compile time error
//        new GenericList<int>()
//        new GenericList<double>()
//        new GenericList<boolean>()

//      Instead of using the primitive types use one of its wrapper classes like
//        new GenericList<Integer>() // to store list of int object
//        new GenericList<Double>() // to store list of double object
//        new GenericList<Character>() // to store list of char object.
        // For the same token you can use other wrapper classes for the other primitive

        GenericList<String> fruits = new GenericList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");

//        You can store anything you want
    }

    public void testGenericWithRestriction() {
        var genericsWithRestriction = new GenericListWithRestriction<>();
    }
}
