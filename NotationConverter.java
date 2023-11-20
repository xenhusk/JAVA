import java.util.*;

public class NotationConverter {

    public static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^' || c == '√' || c == '(' || c == ')';
    }

    public static int precedence(char c) {
        if (c == '^') {
            return 4; // Exponentiation has higher precedence
        } else if (c == '*' || c == '/') {
            return 3;
        } else if (c == '+' || c == '-') {
            return 2;
        } else {
            return 0;
        }
    }

    public static boolean isOperand(char c) {
        return Character.isLetterOrDigit(c);
    }

    public static boolean isFunction(char c) {
        return c == '^' || c == '√';
    }

    public static String detectNotation(String expression) {
        int operatorCount = 0;
        int operandCount = 0;
        boolean containsExponentiation = false;
        Stack<Character> parentheses = new Stack<>();
    
        for (char c : expression.toCharArray()) {
            if (isOperator(c) && !isFunction(c)) {
                operatorCount++;
                if (c == '^') {
                    containsExponentiation = true;
                }
            } else if (isOperand(c) || isFunction(c)) {
                operandCount++;
            } else if (c == '(') {
                parentheses.push(c);
            } else if (c == ')') {
                if (parentheses.isEmpty()) {
                    return "Unknown";
                } else {
                    parentheses.pop();
                }
            }
        }
    
        if (!parentheses.isEmpty() || operatorCount == 0 || operandCount == 0) {
            return "Unknown";
        }
    
        // Check for infix notation with exponentiation
        if (containsExponentiation && operatorCount == 1 && operandCount == 2) {
            return "infix";
        } else if (operatorCount == operandCount - 1) {
            return "postfix";
        } else if (operatorCount == 1 && operandCount == 2) {
            return "prefix";
        } else {
            return "Unknown";
        }
    }    

    public static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char c : infix.toCharArray()) {
            if (isOperand(c)) {
                postfix.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop(); // Discard '('
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                return "Invalid infix expression";
            }
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    public static String infixToPrefix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();
    
        for (int i = infix.length() - 1; i >= 0; i--) {
            char c = infix.charAt(i);
    
            if (isOperand(c)) {
                postfix.append(c);
            } else if (c == ')') {
                stack.push(c);
            } else if (c == '(') {
                while (!stack.isEmpty() && stack.peek() != ')') {
                    postfix.append(stack.pop());
                }
                stack.pop(); // Discard ')'
            } else {
                while (!stack.isEmpty() && precedence(c) < precedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }
    
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }
    
        return postfix.reverse().toString();
    }
    

    public static String postfixToInfix(String postfix) {
        Stack<String> stack = new Stack<>();
    
        for (char c : postfix.toCharArray()) {
            if (isOperand(c)) {
                stack.push(String.valueOf(c));
            } else if (isOperator(c)) {
                String operand2 = stack.pop();
                String operand1 = stack.pop();
                String expression = "(" + operand1 + c + operand2 + ")";
                stack.push(expression);
            }
        }
    
        if (stack.size() != 1) {
            return "Invalid postfix expression";
        }
    
        return stack.pop();
    }

    public static String postfixToPrefix(String postfix) {
        String infix = postfixToInfix(postfix);
        return infixToPrefix(infix);
    }

    public static String prefixToInfix(String prefix) {
        Stack<String> stack = new Stack<>();

        for (int i = prefix.length() - 1; i >= 0; i--) {
            char c = prefix.charAt(i);
            if (isOperand(c)) {
                stack.push(String.valueOf(c));
            } else if (isOperator(c)) {
                String operand1 = stack.pop();
                String operand2 = stack.pop();
                String expression = "(" + operand1 + c + operand2 + ")";
                stack.push(expression);
            }
        }

        if (stack.size() != 1) {
            return "Invalid prefix expression";
        }

        return stack.pop();
    }

    public static String prefixToPostfix(String prefix) {
        String infix = prefixToInfix(prefix);
        return infixToPostfix(infix);
    }

    public static int applyOperator(char operator, int operand1, int operand2) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero error");
                }
                return operand1 / operand2;
            case '^':
                return (int) Math.pow(operand1, operand2);
            case '√':
                return (int) Math.sqrt(operand2);
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
    
    public static int evaluateExpression(String expression) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder operations = new StringBuilder();
        System.out.println("create(s)");
        for (char c : expression.toCharArray()) {
            if (Character.isDigit(c)) {
                int operand = c - '0';
                stack.push(operand);
                operations.append("Push(").append(operand).append(") \n");
            } else if (isOperator(c)) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = applyOperator(c, operand1, operand2);
                stack.push(result);

                operations.append("Pop(s)\n");
                operations.append("Pop(s)\n");
                operations.append("Push(").append(result).append(") ");
            }
        }

        System.out.println(operations);
        return stack.pop();
    }

    public static String operatorToString(char operator) {
        switch (operator) {
            case '+':
                return "+";
            case '-':
                return "-";
            case '*':
                return "*";
            case '/':
                return "/";
            case '^':
                return "^";
            case '√':
                return "√";
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an expression: ");
        String expression = scanner.nextLine();

        String notation = detectNotation(expression);
        System.out.println("Expression is in " + notation + " notation");

        if (notation.equals("infix")) {
            String postfix = infixToPostfix(expression);
            System.out.println("Infix to Postfix: " + postfix);

            String prefix = infixToPrefix(expression);
            System.out.println("Infix to Prefix: " + prefix);

            int result = evaluateExpression(postfix);
            System.out.println("Result: " + result);
        } else if (notation.equals("postfix")) {
            String infixFromPostfix = postfixToInfix(expression);
            System.out.println("Postfix to Infix: " + infixFromPostfix);

            String prefixFromPostfix = postfixToPrefix(expression);
            System.out.println("Postfix to Prefix: " + prefixFromPostfix);

            int result = evaluateExpression(expression);
            System.out.println("Result: " + result);
        } else if (notation.equals("prefix")) {
            String infixFromPrefix = prefixToInfix(expression);
            System.out.println("Prefix to Infix: " + infixFromPrefix);

            String postfixFromPrefix = prefixToPostfix(expression);
            System.out.println("Prefix to Postfix: " + postfixFromPrefix);

            int result = evaluateExpression(postfixFromPrefix);
            System.out.println("Result: " + result);
        } else {
            System.out.println("Invalid notation");
        }

        scanner.close();
    }
}
