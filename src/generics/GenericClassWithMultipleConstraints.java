package generics;

// & (Both type at the same time ) => Intersection operator
// Bounded type parameters
public class GenericClassWithMultipleConstraints<T extends Comparable<T> & Cloneable> {
//    doSomething()
}

class ComparableAndCloneable<T> implements Comparable<T>, Cloneable {

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public ComparableAndCloneable<T> clone() {
        try {
            return (ComparableAndCloneable<T>) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

class ImplementComparable<T> implements Comparable<T> {

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

class TestGenericClassWithMultipleConstraints {
    public static void test() {
        new GenericClassWithMultipleConstraints<>(); // OK
//        new GenericClassWithMultipleConstraints<ImplementComparable>(); // Compilation error
    }
}
