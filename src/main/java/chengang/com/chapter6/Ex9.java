package chengang.com.chapter6;

import java.util.ArrayList;

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

    @Override
    public String toString() {
        return String.format("[first=%s, second=%s]", first.toString(), second.toString());
    }

}

public class Ex9 {
    static <E> Pair<E> firstLast(ArrayList<E> a) {
        return new Pair<>(a.get(0), a.get(a.size() - 1));
    }
}
