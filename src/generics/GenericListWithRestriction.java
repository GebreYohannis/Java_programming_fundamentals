package generics;

import java.math.BigDecimal;

 // Constraints -> restriction (making specific)
// In the following context T can only be the Number class and its derivative

public class GenericListWithRestriction<T extends Number> {
    private T[] items = (T[])new Object[10];
    private int count = 0;

    public void add(T item){
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}

class TestGenericListWithRestriction {
    public static void test() {
//        Compilation error because it only stores Number objects and its derivative
//        new GenericListWithRestriction<String>();  // Compilation error

        new GenericListWithRestriction<Integer>(); // Ok
        new GenericListWithRestriction<BigDecimal>();
        new GenericListWithRestriction<Double>();
        new GenericListWithRestriction<>(); // Type Number default
    }
}