package dequeue;
public class Deque{
    private Node head;
    private Node tail;
}
public class Deque_1 {

    // Node class (inner class)
    static class Node {
        int data;
        Node next, prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node front, rear;

    // Insert at front
    public void insertFront(int x) {
        Node newNode = new Node(x);

        if (front == null) {
            front = rear = newNode;
            return;
        }

        newNode.next = front;
        front.prev = newNode;
        front = newNode;
    }

    // Insert at rear
    public void insertRear(int x) {
        Node newNode = new Node(x);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        newNode.prev = rear;
        rear = newNode;
    }

    // Delete from front
    public void deleteFront() {
        if (front == null) {
            System.out.println("Deque is empty");
            return;
        }

        if (front == rear) {
            front = rear = null;
            return;
        }

        front = front.next;
        front.prev = null;
    }

    // Delete from rear
    public void deleteRear() {
        if (rear == null) {
            System.out.println("Deque is empty");
            return;
        }

        if (front == rear) {
            front = rear = null;
            return;
        }

        rear = rear.prev;
        rear.next = null;
    }

    // Display
    public void display() {
        Node temp = front;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method (entry point)
    public static void main(String[] args) {

        Dequeue dq = new Dequeue();

        dq.insertFront(10);
        dq.insertFront(20);
        dq.insertRear(5);
        dq.insertRear(1);

        System.out.println("Deque after insertions:");
        dq.display();

        dq.deleteFront();
        System.out.println("After deleteFront:");
        dq.display();

        dq.deleteRear();
        System.out.println("After deleteRear:");
        dq.display();
    }
}