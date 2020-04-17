package chengang.com.chapter7;

import com.sun.corba.se.impl.orbutil.CacheTable;

import java.util.LinkedHashMap;
import java.util.Map;

/*
The LinkedHashMap calls the method removeEldestEntry whenever a new element is inserted. Implement a subclass Cache that
limits the map to a given size provided in the constructor.
 */
public class Ex13 {
    static class Cache extends LinkedHashMap<String, String> {
        private final int capacity;
        Cache(int initCapacity) {
            super(initCapacity);
            this.capacity = initCapacity;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry eldest) {
            System.out.println(String.format("removeEldestEntry is being called for the entry=[%1$s]",
                    eldest.getKey()));
            return size() > capacity;
        }
    }

    public  static void main(String[] args) {
        // Ex13 ex13 = new Ex13();
        Cache cache = new Cache(1);
        cache.put("a", "a");
        System.out.println(String.format("cache=[%s]", cache));
        cache.put("b", "b");
        System.out.println(String.format("cache=[%s]", cache));
        cache.put("c", "c");
        System.out.println(String.format("cache=[%s]", cache));
        cache.put("d", "d");
    }
}
