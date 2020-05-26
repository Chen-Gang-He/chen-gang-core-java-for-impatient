package chengang.com.chapter7;

import java.util.*;

public class Ex17 {
    public static void heapPollution(Set<Integer> objects) {
        objects.add(1);
    }

    @SuppressWarnings({"unchecked", "varargs"})
    public static <T> void addToList (List<T> listArg, T... elements) {
        for (T x : elements) {
            listArg.add(x);
        }
    }
    public static void main(String[] args) {
        Set set = new TreeSet();
        set.add("True");
        // heap pollution happens as non-reifiable types in heapPollution.objects will be erased becoming  Set<Object>
        // no-parameter type 'set' can be assigned to the parameter 'objects'
        // but failed to call due to java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
        try {
            heapPollution(set);
        } catch (ClassCastException e) {
            e.printStackTrace();
        }

        List l = new ArrayList<Integer>();
        // Heap pollution may happen when no-parameter type 'set' allocated to List<String>
        List<String> ls = l;
        // unchecked warning
        l.add(0, 42);
        // unchecked warning
        l.add(1, "sdfd");
        // no error
        String s = ls.get(1);
        // java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
        // String s1 = ls.get(0);

        //
        List<String> checkStrings = Collections.checkedList(new ArrayList<>(), String.class);
        // Compiled successfully but runtime error in ADDING rather than getting
        // due to java.lang.ClassCastException: Attempt to insert class java.lang.Integer element into collection with element type class java.lang.String
        checkStrings.addAll(l);
        // addToList(new ArrayList<Integer>(), Arrays.asList("string", "dere"));
    }
}
