package chengang.com.chapter6;

public class Ex8 {
    class Pair<E extends Comparable<? super E>> {
        private E first, second;
        public Pair(E first, E second) {
            this.first = first;
            this.second = second;
        }

        public E getFirst() {
            return first;
        }

        public E getSecond() { return second; }

        public E max() {
            return first.compareTo(second) > 0 ? first : second;
        }

        public E min() {
            return first.compareTo(second) < 0 ? first : second;
        }
    }
    public static void main(String[] args) {
        Pair<String> pair = new Ex8().new Pair<>("first", "second");
        System.out.println(String.format("Max: %s, min: %s", pair.max(), pair.min()));
    }
}
