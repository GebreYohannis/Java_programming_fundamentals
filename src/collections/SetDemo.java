package collections;

import java.util.*;

public class SetDemo {
    public static void show() {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Mango");
        set.add("Banana");
        set.add("Apple");
        System.out.println(set);

        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection,"a","b","a","c","b");
        var uniqueValue = removeDuplicate(collection);
        System.out.println("Unique Value: " + uniqueValue);

        Set<String> other = new HashSet<>();
        other.add("d");
        other.add("f");
        other.add("e");
        set.addAll(other);
        System.out.println(set);

        var containsA = other.contains("a");
        var containsOther = set.containsAll(other);
        System.out.println("Contains Other: " + containsOther);

        set.remove("a");
        set.removeAll(other);
//        set.clear(); // []
        int setSize = set.size();
        var setIterator = set.iterator();
        for (Iterator<String> it = setIterator; it.hasNext(); ) {
            var element = it.next();
            System.out.println(element);
        }
        // or
        while(setIterator.hasNext()) {
            var current = setIterator.next();
            System.out.println(current);
        }
        doTheFourOperationOfSet();
    }

    private static <T> Set<T> removeDuplicate(Collection<? extends T> collection) {
        return new HashSet<>(collection);
    }

    private static void doTheFourOperationOfSet() {
        Set<String> setOne = new HashSet<>(Arrays.asList("a","b","c"));
        Set<String> setTwo = new HashSet<>(Arrays.asList("b","c","d"));

        // The four operation on set
        // 1. Union
        setOne.addAll(setTwo);
        System.out.println(setOne); // [a,b,c,d] order doesn't matter

        // 2. Intersection
        var hasCommonElement = setOne.retainAll(setTwo);
        System.out.println("Common Element: " + setOne);
        System.out.println("Has Comment element: " + hasCommonElement);

        setOne.add("f");
        // 3. Difference
        var hasDifference = setOne.removeAll(setTwo);
        System.out.println("Difference: " + setOne);
    }
}
