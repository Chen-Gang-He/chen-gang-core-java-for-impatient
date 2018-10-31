package chengang.com.chapter3;

import java.util.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 Implement the method void luckySort(ArrayList<String> strings, Comparator<String> comp) that keeps calling
 Collections.shuffle on the array list until the elements are in increasing order, as determined by the comparator.
 */
public class Ex7 {
    static void luckySort(ArrayList<String> strings, Comparator<String> comp) {
        ArrayList<String> copy = new ArrayList<>(strings);
        copy.sort(comp);
        while (! strings.equals(copy)) {
            Collections.shuffle(strings);
        }

    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("xfdho", "dfe", "z"));
        // Ex7.luckySort(list, new Comparator<String>() {
        //     @Override
        //     public int compare(String o1, String o2) {
        //         return o1.compareToIgnoreCase(o2);
        //     }
        // });



        Ex7.luckySort(list, Comparator.comparing(String::toLowerCase));
        System.out.println(Arrays.toString(list.toArray()));
        Ex7.luckySort(list, Comparator.comparing(x -> - x.length()));
        System.out.println(Arrays.toString(list.toArray()));

    }


}
