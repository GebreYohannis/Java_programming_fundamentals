package collections;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void show() {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("c");
        queue.add("b");
        queue.add("a"); // Throw an exception if the queue is full
        queue.offer("d"); // Return false if the queue is full. This is the only difference with the add method
        System.out.println("Queue: " + queue);

        var front = queue.peek(); // Returns null if the queue is empty
        System.out.println("Front: " + front);

        var frontElement = queue.element(); // Throw an exception if the queue is empty. That is the difference with the peek method
        System.out.println("Front Element: " + frontElement);

        // Remove element from the end
        var polledValue = queue.poll(); // Return null if the queue is empty
        System.out.println("Polled Value: " + polledValue);

        var removedValue = queue.remove(); // Throw an exception if the queue is empty
        System.out.println("Removed Value: " + removedValue);

        queue.add("a");
        var isLetterARemoved = queue.remove("a"); // Throw an exception if the element is not found
        System.out.println("Is A Removed: " + isLetterARemoved);

        var isEmpty = queue.isEmpty();

        Queue<String> other = new ArrayDeque<>();
        Collections.addAll(other,"a","b","f","h");
        queue.removeAll(other);

        int sizeOfQueue = queue.size();
        queue.clear(); // Remove all element of queue

        Queue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("a");
        priorityQueue.add("b");
        System.out.println("PriorityDeque: " + priorityQueue);
    }
}
