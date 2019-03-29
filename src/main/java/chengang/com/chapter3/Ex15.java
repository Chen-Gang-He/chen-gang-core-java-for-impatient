package chengang.com.chapter3;

import java.util.Arrays;
import java.util.Random;

/*
Implement the RandomSequence in Section 3.9.1, “Local Classes,” on p. 122 as a nested class, outside the randomInts
method.
 */
public class Ex15 {
    private static Random generators = new Random();

    class RandomSequence implements IntSequence {
        private int low, high;
        public RandomSequence(int low, int high) {
            this.low = low;
            this.high = high;
        }
        public int next() {
            return Ex15.generators.nextInt(high - low + 1) + low;
        }

        public boolean hasNext() {return true;}
    }

    public IntSequence randomInts(int low, int high) {
        return new RandomSequence(low, high);

    }

    public static void main(String[] args) {
        IntSequence randomSequence = new Ex15().randomInts(0, 1);
        int[] numbers = {randomSequence.next(), randomSequence.next(), randomSequence.next(), randomSequence.next()};
        System.out.println(Arrays.toString(numbers));
    }


}
