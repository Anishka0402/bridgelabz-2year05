package Stack;
import java.util.LinkedList;
import java.util.Scanner;

public class StackUsingLinkedList {
    private LinkedList<Integer> list = new LinkedList<>();

    // Push: add element to top of stack
    public void push(int value){
        list.addLast(value);  // Use the parameter, not Scanner
        System.out.println("Pushed: " + value);
    }

    // Pop: remove and return top element
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow!");
            return -1;
        }
        int value = list.removeLast();
        System.out.println("Popped: " + value);
        return value;
    }

    // Peek: return top element without removing
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return -1;
        }
        return list.getLast();
    }

    // Check if stack is empty
    public boolean isEmpty(){
        return list.isEmpty();
    }

    // Get size of stack
    public int size(){
        return list.size();
    }

    // Display all elements
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("Stack (top to bottom): " + list);
    }

    public static void main(String[] args){
        // Create StackUsingLinkedList object, not LinkedList
        StackUsingLinkedList stack = new StackUsingLinkedList();

        // Push some elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Display stack
        stack.display();

        // Peek at top element
        System.out.println("Top element: " + stack.peek());

        // Pop elements
        stack.pop();
        stack.pop();

        // Display after popping
        stack.display();

        System.out.println("Stack size: " + stack.size());
    }
}