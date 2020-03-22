package chengang.com.chapter7;

import java.util.*;
import java.util.function.Predicate;

public class Ex4 {
    private static <E> void removeIf(List<E> list, Predicate<E> predicate) {
        list.removeIf(predicate);
    }

    private static <E> void removeTargetForeach(List<E> list, E target) {
        if (target != null) {
            for (E e : list) {
                if (target == e) {
                    list.remove(target);
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("a", "b"));
        System.out.println(String.format("before remove: %s", linkedList));
        Ex4.<String>removeIf(linkedList, "b"::equals);
        System.out.println(String.format("after remove: %s", linkedList));

        LinkedList<String> linkedList2 = new LinkedList<>(Arrays.asList("a", "b"));
        System.out.println(String.format("before remove: %s", linkedList2));
        Thread peak = new Thread() {
            @Override
            public void run() {
                for (String e : linkedList2) {
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    System.out.println(e);
                }
            }
        };
        // peak.start();
        Thread remove = new Thread() {
            @Override
            public void run() {
                Ex4.<String>removeTargetForeach(linkedList2, "b");
            }
        };
        // remove.start();
        System.out.println(String.format("after remove: %s", linkedList2));

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        removeTargetForeach(list, "a");  // Exception in thread "main" java.util.ConcurrentModificationException


        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println(String.format("%s", numbers));

        for (Iterator<Integer> it = numbers.iterator(); it.hasNext(); ) {
            Integer number = it.next();
            if (number.equals(Integer.valueOf(4))) {
                numbers.remove(4);
            }
            System.out.println(String.format("%s", numbers));

        }
        System.out.println(String.format("%s", numbers));

        for (Iterator<Integer> it = numbers.iterator(); it.hasNext(); ) {
            Integer number = it.next();
            System.out.println(number);
        }

        // for


    }
}
