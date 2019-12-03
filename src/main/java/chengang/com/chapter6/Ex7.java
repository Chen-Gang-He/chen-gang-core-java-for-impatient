package chengang.com.chapter6;

import org.apache.logging.log4j.util.Strings;

/*
Implement a class Pair<E> that stores a pair of elements of type E. Provide accessors to get the first and second
element.
 */
public class Ex7 {
    class Pair<E> {
        private E first, second;
        public Pair(E first, E second) {
            this.first = first;
            this.second = second;
        }

        public E getFirst() {
            return first;
        }

        public E getSecond() { return second; }

    }

    public static void main(String[] args) {
        Pair<String> pair = new Ex7().new Pair<>("first", "second");
        System.out.println(String.format("1st: %s, 2nd: %s", pair.getFirst(), pair.getSecond()));
    }
}
