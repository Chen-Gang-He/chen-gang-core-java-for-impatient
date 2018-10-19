package chengang.com.chapter2;

import java.util.Iterator;

/*
Implement a class Queue, an unbounded queue of strings. Provide methods add, adding at the tail, and remove, removing at
the head of the queue. Store elements as a linked list of nodes. Make Node a nested class. Should it be static or not?
 */
public class Ex17 {
    private Node head;

    private class NodeIterable implements Iterator<Node> {
        private Node pointer = head;

        @Override
        public boolean hasNext() {
            return pointer != null;
        }

        @Override
        public Node next() {
            Node currentPointer = pointer;
            pointer = pointer.nextNode;
//            System.out.println("next node: " + pointer.name);
            return currentPointer;
        }
    }

    private static class Node {
        Node nextNode;
        String name;

        Node(String s) {
            this.name = s;
        }

        @Override
        public String toString() {
            return String.format("Node: %s ", this.name);
        }
    }




    private void add(String s) {
        if (head == null) {
            head = new Node(s);
        } else {
            Node lastNode = head;
            while (lastNode.nextNode != null) {
                lastNode = head.nextNode;
            }
            lastNode.nextNode = new Node(s);
        }
    }

    private void show() {
        if (head != null) {
            Node nextNode = head;
            while (nextNode != null) {
                System.out.println(nextNode);
                nextNode = nextNode.nextNode;
            }
        }
    }

    private Node remove() {
        if (head == null) {
            return null;
        }
        Node secondNode = head.nextNode;
        head = secondNode;
        return secondNode;
    }

    public static void main(String[] args) {
        Ex17 ex17 = new Ex17();
        ex17.add("1");
        ex17.add("2");
        ex17.add("3");
//        ex17.show();
        System.out.println("remove head : " + ex17.remove());
        ex17.add("4");
//        ex17.show();
        Ex17.NodeIterable iterable = ex17.new NodeIterable();
//        System.out.println(iterable.pointer);
        while (iterable.hasNext()) {
//            Node curentNode = iterable.hasNext();
            System.out.println(iterable.next());
        }


    }
}
