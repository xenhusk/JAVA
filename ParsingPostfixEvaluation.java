import java.util.*;

public class ParsingPostfixEvaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Double> stack = new Stack<>();
        char choice;
        boolean MainLoop = true;

        do {
            System.out.println("Main Menu");
            System.out.println("[1] PARSING");
            System.out.println("[2] POSTFIX EVALUATION");
            System.out.println("[3] EXIT");
            System.out.print("Enter your choice: ");
            int menuChoice = scanner.nextInt();

            switch (menuChoice) {
                case 1:
                    do {
                        parsingInput(scanner);
                        System.out.print("Run Again? (Y/N): ");
                        choice = scanner.next().charAt(0);
                    } while (choice == 'Y' || choice == 'y');
                    break;
                case 2:
                    do {
                        postfixEvaluation(scanner, stack);
                        System.out.print("Run Again? (Y/N): ");
                        choice = scanner.next().charAt(0);
                    } while (choice == 'Y' || choice == 'y');

                    break;
                case 3:
                    System.out.println("Exiting...");
                    MainLoop = false;
                    return;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
                    break;
            }
        } while (MainLoop == true);
    }

    public static void parsingInput(Scanner scanner) {
        scanner.nextLine(); // Consume newline
        System.out.print("Enter the expression: ");
        String input = scanner.nextLine();

        List<Integer> operands = new ArrayList<>();
        List<Character> operators = new ArrayList<>();

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                operands.add(Character.getNumericValue(c));
            } else if (c != ' ') {
                operators.add(c);
            }
        }

        System.out.println("OPERANDS: " + operands);
        System.out.println("OPERATORS: " + operators);
    }

    public static void postfixEvaluation(Scanner scanner, Stack<Double> stack) {
        stack.clear(); // Clear the stack for new evaluation
        scanner.nextLine(); // Consume newline
        System.out.print("Enter the expression: ");
        String input = scanner.nextLine();

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push((double) Character.getNumericValue(c));
                System.out.println("push(" + (double) Character.getNumericValue(c) + ", s)");
            } else if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^' || c == '√') {
                if (c == '√') {
                    double operand = stack.pop();
                    double result = Math.sqrt(operand);
                    stack.push(result);
                    System.out.println("pop(s)");
                    System.out.println("push(" + result + ", s)");
                } else if (c == '^') {
                    double operand2 = stack.pop();
                    double operand1 = stack.pop();
                    double result = Math.pow(operand1, operand2);
                    stack.push(result);
                    System.out.println("pop(s)");
                    System.out.println("pop(s)");
                    System.out.println("push(" + result + ", s)");
                } else {
                    double operand2 = stack.pop();
                    double operand1 = stack.pop();
                    double result;

                    switch (c) {
                        case '+':
                            result = operand1 + operand2;
                            break;
                        case '-':
                            result = operand1 - operand2;
                            break;
                        case '*':
                            result = operand1 * operand2;
                            break;
                        case '/':
                            result = operand1 / operand2;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid operator");
                    }

                    stack.push(result);
                    System.out.println("pop(s)");
                    System.out.println("pop(s)");
                    System.out.println("push(" + result + ", s)");
                }
            }
        }

        System.out.println("Updated stack: " + stack);
    }

}
