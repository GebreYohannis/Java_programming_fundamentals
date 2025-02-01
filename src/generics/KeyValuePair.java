package generics;

import com.sun.jdi.VoidValue;

public class KeyValuePair <K, V> {
    private K key;
    private V value;

    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }
}

class KeyValuePairLocal <K extends Comparable<K>, V extends VoidValue> {
    private K key;
    private V value;

    KeyValuePairLocal(K key, V value) {
        this.key = key;
        this.value = value;
    }

    int compareTo(K other) {
        return key.compareTo(other);
    }
}
