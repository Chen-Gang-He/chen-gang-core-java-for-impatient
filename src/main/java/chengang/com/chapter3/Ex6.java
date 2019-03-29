package chengang.com.chapter3;

import java.util.Iterator;

/**
 *
 */
public class Ex6 {

    class DigitSequence implements Iterator<Integer>, Iterable<Integer> {
        private int number;
        public DigitSequence(int n) {
            this.number = n;
        }

        public boolean hasNext() {
            return number != 0;
        }

        public Integer next() {
            Integer result = number % 10;
            number = number / 10;
            return result;
        }

        // public void remove() {
        // }

        public Iterator<Integer> iterator() {
            return this;
        }
    }

    public static void main(String[] args) {
        Ex6 ex6 = new Ex6();

        DigitSequence digitSequence = ex6.new DigitSequence(1223);

        for (Integer i: digitSequence) {
            System.out.println(String.format("number: %d", i));
        }
        DigitSequence ds1 = ex6.new DigitSequence(341);
        ds1.remove();  // Raise java.lang.UnsupportedOperationException: remove

    }



}
