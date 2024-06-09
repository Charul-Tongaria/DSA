import java.util.*;

public class DoublyLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    public DoublyLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Add first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Add last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Remove first
    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head == tail) {
            head = tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    // Remove last
    public void removeLast() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head == tail) {
            head = tail = null;
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }

    // Print
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();
        System.out.println("Size: " + dll.size);
        
        dll.removeFirst();
        dll.print();
        System.out.println("Size: " + dll.size);

        dll.addLast(4);
        dll.print();
        System.out.println("Size: " + dll.size);

        dll.removeLast();
        dll.print();
        System.out.println("Size: " + dll.size);
    }
}
