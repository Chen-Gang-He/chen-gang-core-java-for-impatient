package chengang.com.chapter6;

/*
Implement a class Stack<E> that manages an array list of elements of type E. Provide methods push, pop, and isEmpty.
 */

import java.util.ArrayList;

public class Ex1 {
    class Stack<E> {
        private ArrayList<E> list = new ArrayList<>();

        void push(E object) {
            list.add(object);
        }

        E pop() {
            return list.remove(list.size() -1);
        }

        boolean isEmpty() {
            return list.isEmpty();
        }
    }

    public static void main(String[] args) {
        Ex1 ex1 = new Ex1();
        Stack<Integer> stack = ex1.new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}
