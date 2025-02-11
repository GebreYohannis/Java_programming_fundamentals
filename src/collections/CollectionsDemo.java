package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();
        // Add Item to the collection
        collection.add("a");
        collection.add("b");
        collection.add("c");
        Collections.addAll(collection,"d","e","f");

        System.out.println("Collections: " + collection);
        System.out.println("Size: " + collection.size());

        // Remove item from the collection
        collection.remove("a");
        System.out.println("New Collections: " + collection);


        Collection<String> newCollection = new ArrayList<>();
        Collections.addAll(newCollection,"a","b","c","d");
        // Remove item if the collection matches
        collection.removeAll(newCollection); // Remove matching item

        System.out.println("Collections: " + collection); // Collections: [e,f]
//        collection.clear(); // Remove all item from the collection
        System.out.println(collection.isEmpty());
        var containsF = collection.contains("f");
        System.out.println(containsF);

//         Convert collection to regular array
//         object array
        Object[] objectArray = collection.toArray();
        String regularString = Arrays.toString(objectArray);
//        System.out.println("Regular String: " + regularString);

        String[] stringArray = collection.toArray(new String[0]);
        String upperCase = stringArray[0].toUpperCase();
//        System.out.println("Upper Case: " + upperCase);

        Collection<String> other = new ArrayList<>();
        other.addAll(collection);
        System.out.println("Other: " + other);
        System.out.println(collection == other);
        System.out.println(collection.equals(other));

    }

}
