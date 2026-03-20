package Queue;

public class QueueUsingList {
    // Inner Node class for linked list
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Queue implementation
    static class Queue {
        Node rear;
        Node front;

        public Queue() {
            rear = null;
            front = null;
        }

        public void enqueue(int data) {
            Node newNode = new Node(data);
            if (rear == null) {
                rear = newNode;
                front = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
        }

        public Integer dequeue() {
            if (front == null) {
                return null;
            }
            int data = front.data;
            front = front.next;
            if (front == null) {
                rear = null;  // Queue is now empty
            }
            return data;
        }

        public boolean isEmpty() {
            return front == null;
        }

        public Integer peek() {
            if (front == null) {
                return null;
            }
            return front.data;
        }
    }

    // Test the queue
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued: " + queue.dequeue());  // 10
        System.out.println("Dequeued: " + queue.dequeue());  // 20
        System.out.println("Peek: " + queue.peek());          // 30
    }
}