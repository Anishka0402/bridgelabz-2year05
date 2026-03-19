package Stack;
import java.util.Stack;

public class SortStackInAscendingOrderUsingRecurrsion {

    public static void sortedInsert(Stack<Integer> s, int x) {
        if (s.isEmpty() || x > s.peek()) {
            s.push(x);
            return;
        }

        int temp = s.pop();
        sortedInsert(s, x);
        s.push(temp);
    }

    public static void sortStack(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int x = s.pop();
            sortStack(s);
            sortedInsert(s, x);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(30);
        s.push(-5);
        s.push(18);
        s.push(14);
        s.push(-3);

        System.out.println("Stack before sorting: " + s);

        sortStack(s);

        System.out.println("Stack after sorting: " + s);
    }
}
