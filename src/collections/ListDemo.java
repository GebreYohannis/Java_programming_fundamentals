package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(0,"!");

        System.out.println("List: " + list);

        List<String> other = new ArrayList<>();
        Collections.addAll(other,"d","e","f");
        System.out.println("Other List: "  + other);

        list.addAll(other);
        System.out.println("List: "  + list);
        list.set(0, "@"); // update element
        var updatedValue = list.get(0);
//        for(var value: list)
//            System.out.println(value);

        other.add("@");
        list.retainAll(other);
        System.out.println("list After retain: " + list);
        list.remove(0);
        System.out.println("List :"+ list);
        System.out.println("IndexOf d: " + list.indexOf("d"));

        list.add("d");
        System.out.println("LastIndexOf d:" + list.lastIndexOf("d"));

        List<String> subList = list.subList(0,2); // The original list is not affected
        System.out.println("SubList: " + subList);
        System.out.println("OriginalList: " + list);

    }
}
