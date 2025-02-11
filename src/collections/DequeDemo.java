package collections;

import java.util.Deque;
import java.util.Collections;
import java.util.ArrayDeque;

public class DequeDemo {
    public static void show() {
        // Programming to a Deque<T> Interface
        Deque<String> deque = new ArrayDeque<>();
        deque.add("a");
        deque.add("b");
        Collections.addAll(deque, "c", "d", "f");
        System.out.println(deque);

        deque.addFirst("g");
        deque.addLast("h");
        var reversed = deque.reversed();
        System.out.println("Original deque: " + deque);
        System.out.println("Reversed deque: " + reversed);
        deque.push("J");
        System.out.println(deque);
        System.out.println(deque.pop());
        var descendingIterator = deque.descendingIterator();
        // the following loop is exactly the same as while loop
        for (; descendingIterator.hasNext(); )
            System.out.println(descendingIterator.next());
    }
}
