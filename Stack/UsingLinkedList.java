public class UsingLinkedList {

}

class Stack<T> {
    // T data;
    Node head;
    int size;

    Stack() {
        size = 0;
        head = null;
    }

    public void push(int data) {
        Node<Integer> temp = new Node(data);
        temp.next = head;
        head = temp;
        size++;
    }
}

// 1 = 2 = 3
class Node<T> {
    T data;
    Node next;

    Node(T data) {
        this.data = data;
    }
}
