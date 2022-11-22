package Linked_List;

public class Main {
    public static void main(String[] args) {
        LL<Integer> node = new LL();
        node.insertFirst(1);
        node.insertFirst(12);
        node.print();
        System.out.println();
    }

}

class LL<T> {
    Node head;
    Node tail;
    int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (head == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}

class Node<T> {
    T value;
    Node next;

    public Node(T value) {
        this.value = value;
    }
}
