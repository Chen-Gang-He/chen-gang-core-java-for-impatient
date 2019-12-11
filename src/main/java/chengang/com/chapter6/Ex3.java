package chengang.com.chapter6;

import java.util.ArrayList;
import java.util.Objects;

/*
Implement a class Ch6.Table<K, V> that manages an array list of Ch6.Entry<K, V> elements. Supply methods to get the
value associated with a key, to put a value for a key, and to remove a key.
 */
class Entry<K, V> implements Comparable<Entry<K, V>> {
    private K key;
    private V value;
    Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    Entry() {
        this(null, null);
    }

    K getKey() { return key; }

    V getValue() { return value; }

    void setValue(V value) { this.value = value; }

    @Override
    public int compareTo(Entry<K, V> o) {
        return key == o.key && value == o.value ? 1 : 0;
    }

    @Override
    public String toString() {
        return String.format("[Key=%s, Value=%s]", key.toString(), value.toString());
    }
}

class Table<K, V> {
    private ArrayList<Entry<K, V>> entries = new ArrayList<>();
    V get(K key) {
        for (Entry<K, V> entry: entries) {
            if (key == entry.getKey()) return entry.getValue();
        }
        return null;
    }

    void put(K key, V value) {
        for (Entry<K, V> entry: entries) {
            if (key == entry.getKey()) entry.setValue(value);
        }
        // new entry
        entries.add(new Entry<>(key, value));
    }

    Entry<K,V>  remove(K key) {
        for (Entry<K, V> entry: entries) {
            if (key == entry.getKey()) return entry;
        }
        return null;
    }

}
public class Ex3 {
    public static void main(String[] args) {
        Table<String,Integer> stooges = new Table<>();
        stooges.put("Moe",1);
        stooges.put("Curly",2);
        stooges.put("Shemp",3);
        System.out.println(stooges.get("Curly"));
        Entry<String,Integer> stooge = stooges.remove("Shemp");
        System.out.println(stooge.getKey());
    }
}
