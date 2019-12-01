package chengang.com.chapter6;
/*
Reimplement the Stack<E> class, using an array to hold the elements. If necessary, grow the array in the push method.
Provide two solutions, one with an E[] array and one with an Object[] array. Both solutions should compile without
warnings. Which do you prefer, and why?
 */

import java.lang.reflect.Array;

public class Ex2 {
    static class Stack<E> {
        private int initialArrayLength = 2;
        @SuppressWarnings("unchecked") private E[] list = (E[]) new Object[initialArrayLength];
        private int index = 0;

        void push(E object) {
            if (index >= list.length)  list = arrayGrow(list, list.length * 2);
            list[index++] = object;
        }

        E pop() {
            return list[--index];
        }

        boolean isEmpty() {
            return index == 0;
        }

        E[] arrayGrow(E[] array, int n) {
            if (array == null) return null;
            int newArrayLength = n;
            if (n < array.length) newArrayLength *= 2;
            @SuppressWarnings("unchecked") E[] newArray = (E[]) Array.newInstance(array.getClass().getComponentType(), newArrayLength);
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            return newArray;
        }
    }

    static class StackObject<E> {
        private int initialArrayLength = 2;
        private Object[] list = new Object[initialArrayLength];
        private int index = 0;

        void push(Object object) {
            if (index >= list.length) list = (Object[]) arrayGrow(list, list.length * 2);
            list[index++] = object;
        }

        Object pop() {
            return list[--index];
        }

        boolean isEmpty() {
            return index == 0;
        }

        Object arrayGrow(Object[] array, int n) {
            if (array == null) return null;
            int newArrayLength = n;
            if (n < array.length) newArrayLength *= 2;
//            Class<?> cls = array.getClass().getComponentType();
            Object newArray = Array.newInstance(array.getClass().getComponentType(), newArrayLength);
            for (int i = 0; i < array.length; i++) {
                Array.set(newArray, i, array[i]);
            }
            return newArray;
        }
    }

    public static void main(String[] args) {
//        Ex2 ex2 = new Ex2();
        Stack<Integer> stack = new Ex2.Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());

        StackObject<Integer> stack2 = new Ex2.StackObject<>();
        stack2.push(1);
        stack2.push("2xxx"); // no type checking
        stack2.push(3);
        System.out.println(stack2.pop());
        stack2.push(4);
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.isEmpty());
    }
}
