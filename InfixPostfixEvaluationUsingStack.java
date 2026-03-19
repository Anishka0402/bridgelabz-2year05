package Stack;
import java.util.Stack;
    public class InfixPostfixEvaluationUsingStack {
        public static void main(String[] args) {
            String infix = "3 + 4 * 2 / ( 1 - 5 )";
            String postfix = infixToPostfix(infix);
            System.out.println("Postfix Expression: " + postfix);
            int result = evaluatePostfix(postfix);
            System.out.println("Evaluation Result: " + result);
        }

        private static String infixToPostfix(String infix) {
            StringBuilder postfix = new StringBuilder();
            Stack<Character> stack = new Stack<>();
            for (char ch : infix.toCharArray()) {
                if (Character.isDigit(ch)) {
                    postfix.append(ch).append(' ');
                } else if (ch == '(') {
                    stack.push(ch);
                } else if (ch == ')') {
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        postfix.append(stack.pop()).append(' ');
                    }
                    stack.pop(); // Pop '('
                } else if (isOperator(ch)) {
                    while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
                        postfix.append(stack.pop()).append(' ');
                    }
                    stack.push(ch);
                }
            }
            while (!stack.isEmpty()) {
                postfix.append(stack.pop()).append(' ');
            }
            return postfix.toString().trim();
        }

        private static int evaluatePostfix(String postfix) {
            Stack<Integer> stack = new Stack<>();
            for (String token : postfix.split(" ")) {
                if (token.matches("\\d+")) {
                    stack.push(Integer.parseInt(token));
                } else if (isOperator(token.charAt(0))) {
                    int b = stack.pop();
                    int a = stack.pop();
                    switch (token.charAt(0)) {
                        case '+':
                            stack.push(a + b);
                            break;
                        case '-':
                            stack.push(a - b);
                            break;
                        case '*':
                            stack.push(a * b);
                            break;
                        case '/':
                            stack.push(a / b);
                            break;
                    }
                }
            }
            return stack.pop();
        }

        private static boolean isOperator(char ch) {
            return ch == '+' || ch == '-' || ch == '*' || ch == '/';
        }

        private static int precedence(char op) {
            switch (op) {
                case '+':
                case '-':
                    return 1;
                case '*':
                case '/':
                    return 2;
                default: return;
            }
        }
    }


