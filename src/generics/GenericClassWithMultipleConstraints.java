package generics;

// & (Both type at the same time ) => Intersection operator
// Bounded type parameters
public class GenericClassWithMultipleConstraints<T extends Comparable & Cloneable> {
//    doSomething()
}

class ComparableAndCloneable implements Comparable , Cloneable {

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

class ImplementComparable implements Comparable {

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

class TestGenericClassWithMultipleConstraints {
    public static void test() {
        new GenericClassWithMultipleConstraints<ComparableAndCloneable>(); // OK
//        new GenericClassWithMultipleConstraints<ImplementComparable>(); // Compilation error
    }
}
