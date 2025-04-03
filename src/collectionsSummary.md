# Java Collections Framework Interfaces

## 1️⃣ Collection Interface (`Collection<E>`)
The root interface in the Java Collections Framework that represents a **group of objects** (also called elements). It provides basic methods for adding, removing, and checking elements.

🔹 **Superinterfaces:** `Iterable<E>`  
🔹 **Subinterfaces:** `List<E>`, `Set<E>`, `Queue<E>`

### **Common Methods:**
- `boolean add(E e)`: Adds an element.
- `boolean remove(Object o)`: Removes an element.
- `boolean contains(Object o)`: Checks if an element exists.
- `int size()`: Returns the number of elements.
- `void clear()`: Removes all elements.

---

## 2️⃣ List Interface (`List<E>`)
An **ordered collection** (also known as a sequence) that allows **duplicate elements** and provides **positional access**.

🔹 **Superinterface:** `Collection<E>`  
🔹 **Implementations:** `ArrayList<E>`, `LinkedList<E>`, `Vector<E>`

### **Common Methods:**
- `E get(int index)`: Retrieves an element by index.
- `E set(int index, E element)`: Replaces an element.
- `void add(int index, E element)`: Inserts an element at a specific position.
- `E remove(int index)`: Removes an element at a specific index.

---

## 3️⃣ Set Interface (`Set<E>`)
A **collection of unique elements** that does **not allow duplicates**. It models the mathematical **set abstraction**.

🔹 **Superinterface:** `Collection<E>`  
🔹 **Implementations:** `HashSet<E>`, `LinkedHashSet<E>`, `TreeSet<E>`

### **Common Methods:**
- `boolean add(E e)`: Adds an element if not already present.
- `boolean remove(Object o)`: Removes an element.
- `boolean contains(Object o)`: Checks if an element exists.

---

## 4️⃣ SortedSet Interface (`SortedSet<E>`)
An extension of `Set<E>` that maintains elements in **sorted order** (ascending by default).

🔹 **Superinterface:** `Set<E>`  
🔹 **Implementation:** `TreeSet<E>`

### **Common Methods:**
- `E first()`: Returns the first (lowest) element.
- `E last()`: Returns the last (highest) element.
- `SortedSet<E> headSet(E toElement)`: Returns a sub-set before a given element.

---

## 5️⃣ NavigableSet Interface (`NavigableSet<E>`)
A **SortedSet** with additional methods for **navigation**, such as finding the closest matches to a given element.

🔹 **Superinterface:** `SortedSet<E>`  
🔹 **Implementation:** `TreeSet<E>`

### **Common Methods:**
- `E ceiling(E e)`: Returns the smallest element ≥ `e`.
- `E floor(E e)`: Returns the largest element ≤ `e`.
- `E higher(E e)`: Returns the smallest element > `e`.
- `E lower(E e)`: Returns the largest element < `e`.

---

## 6️⃣ Queue Interface (`Queue<E>`)
A collection that follows the **FIFO (First-In-First-Out)** order for processing elements.

🔹 **Superinterface:** `Collection<E>`  
🔹 **Implementations:** `LinkedList<E>`, `PriorityQueue<E>`

### **Common Methods:**
- `boolean offer(E e)`: Adds an element to the queue.
- `E poll()`: Retrieves and removes the head, or `null` if empty.
- `E peek()`: Retrieves but does not remove the head.

---

## 7️⃣ Deque Interface (`Deque<E>`)
A **double-ended queue** that allows insertions and removals from both ends.

🔹 **Superinterface:** `Queue<E>`  
🔹 **Implementations:** `ArrayDeque<E>`, `LinkedList<E>`

### **Common Methods:**
- `void addFirst(E e)`: Inserts an element at the front.
- `void addLast(E e)`: Inserts an element at the rear.
- `E removeFirst()`: Removes the first element.
- `E removeLast()`: Removes the last element.

---

## 8️⃣ Map Interface (`Map<K, V>`)
A collection that stores **key-value pairs** and does **not allow duplicate keys**.

🔹 **Superinterface:** `None` (It is not a subtype of `Collection<E>`)  
🔹 **Implementations:** `HashMap<K, V>`, `LinkedHashMap<K, V>`, `TreeMap<K, V>`

### **Common Methods:**
- `V put(K key, V value)`: Adds or updates a key-value pair.
- `V get(Object key)`: Retrieves the value associated with a key.
- `V remove(Object key)`: Removes a key-value pair.
- `boolean containsKey(Object key)`: Checks if a key exists.

---

## 9️⃣ SortedMap Interface (`SortedMap<K, V>`)
An extension of `Map<K, V>` that maintains **keys in sorted order**.

🔹 **Superinterface:** `Map<K, V>`  
🔹 **Implementation:** `TreeMap<K, V>`

### **Common Methods:**
- `K firstKey()`: Returns the first (lowest) key.
- `K lastKey()`: Returns the last (highest) key.
- `SortedMap<K, V> headMap(K toKey)`: Returns a sub-map before a given key.

---

## 🔟 NavigableMap Interface (`NavigableMap<K, V>`)
A **SortedMap** with additional methods for **navigation**, such as finding closest matches.

🔹 **Superinterface:** `SortedMap<K, V>`  
🔹 **Implementation:** `TreeMap<K, V>`

### **Common Methods:**
- `K ceilingKey(K key)`: Returns the smallest key ≥ `key`.
- `K floorKey(K key)`: Returns the largest key ≤ `key`.
- `K higherKey(K key)`: Returns the smallest key > `key`.
- `K lowerKey(K key)`: Returns the largest key < `key`.

---

## **📌 Summary of Key Interfaces in Java Collections Framework**

- `Collection<E>` → Root interface for all collection types.
- `List<E>` → Ordered collection allowing duplicates (e.g., `ArrayList`, `LinkedList`).
- `Set<E>` → Unordered collection without duplicates (e.g., `HashSet`, `TreeSet`).
- `Queue<E>` → FIFO collection (e.g., `LinkedList`, `PriorityQueue`).
- `Deque<E>` → Double-ended queue allowing insertion/removal from both ends.
- `Map<K, V>` → Key-value pairs without duplicate keys (e.g., `HashMap`, `TreeMap`).
- `SortedSet<E>` → `Set<E>` that maintains elements in sorted order (`TreeSet`).
- `NavigableSet<E>` → `SortedSet<E>` with navigation methods (`TreeSet`).
- `SortedMap<K, V>` → `Map<K, V>` with sorted keys (`TreeMap`).
- `NavigableMap<K, V>` → `SortedMap<K, V>` with navigation methods (`TreeMap`).
# Java Collections Framework Exceptions

## Exceptions Thrown by the Java Collections Framework

The Java Collections Framework (JCF) throws several exceptions, primarily from the `java.util` package. These exceptions are mostly **unchecked exceptions** (runtime exceptions) and typically occur due to invalid operations on collections. Below is a comprehensive list of exceptions thrown by the JCF, along with their causes and examples.

| **Exception**                          | **Cause** |
|----------------------------------------|-----------------------------------------------------------|
| `UnsupportedOperationException`        | Modifying an **immutable** collection. |
| `ClassCastException`                   | Casting an object to an **incompatible type**. |
| `NullPointerException`                 | Performing operations on a **null collection**. |
| `IllegalArgumentException`             | Passing an **invalid argument** to a method. |
| `IndexOutOfBoundsException`            | Accessing an **invalid index** in a list. |
| `ConcurrentModificationException`      | Modifying a collection **while iterating** over it. |
| `NoSuchElementException`               | Accessing a **non-existent element** from an iterator, queue, or stack. |
| `IllegalStateException`                | Calling a method at an **inappropriate time**. |
| `ArrayStoreException`                  | Storing an **incorrect type** in an array used within a collection. |

---

## Summary of Key Java Collection Framework Exceptions

- `UnsupportedOperationException`: Raised when an operation is not supported (e.g., modifying an immutable collection).
- `ClassCastException`: Thrown when an object is cast to an incompatible type.
- `NullPointerException`: Occurs when performing operations on a `null` collection.
- `IllegalArgumentException`: Thrown when an invalid argument is passed to a method.
- `IndexOutOfBoundsException`: Raised when accessing an invalid index in a list.
- `ConcurrentModificationException`: Happens when a collection is modified while being iterated.
- `NoSuchElementException`: Thrown when an attempt is made to access a non-existent element from an iterator, queue, or stack.
- `IllegalStateException`: Raised when a method is invoked at an inappropriate time.
- `ArrayStoreException`: Occurs when an incorrect type is stored in an array used within a collection.

---

These exceptions help maintain the integrity of collections and provide useful feedback when operations are performed incorrectly. Always ensure that you handle these exceptions properly in your code to avoid unexpected crashes.

## Demo examples
**Collections**
```java
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

```
### Comparing objects
**The Comparable&lt;T&gt; interface**
```java
package collections;

public class User implements Comparable<User> {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(User other) {
        return name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name;
    }
}


```
```java
package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public static void show() {
        List<User> users = new ArrayList<>();
        users.add(new User("B"));
        users.add(new User("A"));
        users.add(new User("C"));
        Collections.sort(users);
        System.out.println("Users After Sorted: " + users);
    }
}

```
**The Comparator&lt;T&gt; interface**
```java
package collections;

public class Customer {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "{ name: " + name + ", email: " + getEmail() + " } ";
    }
}

```

```java
package collections;

import java.util.Comparator;

public class EmailComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer first, Customer second) {
        return first.getEmail().compareTo(second.getEmail());
    }
}

```
```java
package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
    public static void show() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("a","e2"));
        customers.add(new Customer("d", "e1"));
        customers.add(new Customer("b","e3"));

        System.out.println(customers);
        Collections.sort(customers,new EmailComparator());
        System.out.println("After Sorted: " + customers);
    }
}

```
**The Iterable&lt;T&gt; and Iterator&lt;T&gt; Interfaces**
- Besides the java collections we can also define our own iterable by implementing these interfaces
```java
package collections;

import java.util.Iterator;

/** Implementing the Iterable and Iterator interfaces
*
* */

public class GenericList<T> implements Iterable<T> {
    private T[] items = (T[]) new Object[10];
    private int count = 0;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this);
    }

    private class ListIterator implements Iterator<T> {
        private GenericList<T> list;
        private int index = 0;

        public ListIterator(GenericList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return (index < list.count);
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }
}

```

```java
package collections;

public class TestGenericIteratorList {
    public static void test() {
        GenericList<Integer> list = new GenericList<>();
        list.add(12);
        list.add(13);
        list.add(15);
        for (var current : list) {
            System.out.println(current);
        }

        // or
        var iterator = list.iterator();
        while(iterator.hasNext()) {
            var current = iterator.next();
            System.out.println(current);
        }
    }
}

```
**The List collections**
```java
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

```
**The Set collections**
```java
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

```
**The Queue collections**
```java
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

```
**The Deque collections**
```java
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

```
**The Map collections**
```java
package collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void show() {
        Map<Integer, String> keyValuePair = new HashMap<>();
        keyValuePair.put(1, "Apple");
        keyValuePair.put(2, "Mango");
        keyValuePair.put(3, "Lemon");
        System.out.println(keyValuePair);

        var c1 = new Customer("a", "e1");
        var c2 = new Customer("b", "e2");
        Map<String, Customer> customers = new HashMap<>();
        customers.put(c1.getEmail(), c1);
        customers.put(c2.getEmail(), c2);

        var customer = customers.get("e1");
        System.out.println("Customer: " + customer);

        Customer unknown = new Customer("Unknown", "");
        var unknownCustomer = customers.getOrDefault("e10", unknown);
        System.out.println("Unknown Customer: " + unknownCustomer);

        var isWithInTheList = customers.containsKey("e11");
        System.out.println("Is with in the list: " + isWithInTheList);

        // Iterate over map element
        for (var key : customers.keySet())
            System.out.println("{ " + key + ": " + customers.get(key));

        for (var c : customers.values())
            System.out.println(c);

        for (var entry : customers.entrySet())
            System.out.println("Entry: { " + entry.getKey() + " : " + entry.getValue() + " }");

        // Update
        customers.replace("e1",new Customer("c","e1"));
        System.out.println(customers);
    }
}



```