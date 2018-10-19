package chengang.com.chapter2;

/*
Implement a class Queue, an unbounded queue of strings. Provide methods add, adding at the tail, and remove, removing at
the head of the queue. Store elements as a linked list of nodes. Make Node a nested class. Should it be static or not?
 */
public class Ex17 {
    private Node head;

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
        Ex17 ex16 = new Ex17();
        ex16.add("1");
        ex16.add("2");
        ex16.add("3");
        ex16.show();
        System.out.println("remove head : " + ex16.remove());
        ex16.add("4");
        ex16.show();


    }
}
