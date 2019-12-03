package chengang.com.chapter6;

import java.util.ArrayList;

/*
Implement a generic method that appends all elements from one array list to another. Use a wildcard for one of the type
arguments. Provide two equivalent solutions, one with a ? extends E wildcard and one with ? super E.
 */
public class Ex6 {
    static <T> ArrayList<T> append(ArrayList<T> arrayToAppend, ArrayList<? extends T> array) {
         arrayToAppend.addAll(array);
         return arrayToAppend;
    }

    static <T> ArrayList<? super T> append2(ArrayList<? super T> arrayToAppend, ArrayList<T> array) {
        arrayToAppend.addAll(array);
        return arrayToAppend;
    }
}
