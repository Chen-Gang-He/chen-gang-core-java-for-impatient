package chengang.com.chapter6;
/*
In the previous exercise, make Entry into a nested class. Should that class be generic?
 */

import java.util.ArrayList;

class TableNestedEntry<K, V> {
    private ArrayList<Entry> entries = new ArrayList<>();
    V get(K key) {
        for (Entry entry: entries) {
            if (key == entry.getKey()) return entry.getValue();
        }
        return null;
    }

    void put(K key, V value) {
        for (Entry entry: entries) {
            if (key == entry.getKey()) entry.setValue(value);
        }
        // new entry
        entries.add(new Entry(key, value));
    }

    Entry  remove(K key) {
        for (Entry entry: entries) {
            if (key == entry.getKey()) return entry;
        }
        return null;
    }

    class Entry implements Comparable<Entry> {
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
        public int compareTo(Entry o) {
            return key == o.key && value == o.value ? 1 : 0;
        }
    }
}
public class Ex4 {
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
