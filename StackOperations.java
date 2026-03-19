package Stack;

// Remove the import - we're building our own Stack!

public class StackOperations {
    //Stack implementation using array
    class Stack {
        private int[] arr;
        private int top;
        private int capacity;

        public Stack(int size) {
            arr = new int[size];
            capacity = size;
            top = -1;
        }

        public void push(int x) {
            if (isFull()) {
                resize();
            }
            arr[++top] = x;
            System.out.println("Pushed: " + x);
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow!");
                return -1;
            }
            return arr[top--];
        }

        public int peek() {
            if (!isEmpty()) {
                return arr[top];
            }
            return -1;
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == capacity - 1;
        }

        public void resize(){
            int newCapacity = capacity * 2;
            int[] newArr = new int[newCapacity];

            // Only copy elements up to 'top' (more efficient)
            for(int i = 0; i <= top; i++){
                newArr[i] = arr[i];
            }
            arr = newArr;
            capacity = newCapacity;

            System.out.println("Stack resized to capacity: " + capacity);
        }
    }

    // Main method should be here (outer class) and STATIC
    public static void main(String[] args){
        StackOperations stackOps = new StackOperations();
        Stack stack = stackOps.new Stack(2);

        stack.push(1);
        stack.push(2);
        stack.push(3);  // This will trigger resize!

        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top element after popping: " + stack.peek());
    }
}