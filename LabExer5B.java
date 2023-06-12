import java.util.InputMismatchException;
import java.util.Scanner;

public class LabExer5B {

    private static final String[] QUESTIONS = {
        "1) What is the capital of France?",
        "2) Who painted the Mona Lisa?",
        "3) What is the largest ocean in the world?",
        "4) Which planet is known as the Red Planet?",
        "5) Who is the author of the Harry Potter series?",
        "6) Which country is famous for the Taj Mahal?",
        "7) What is the chemical symbol for gold?",
        "8) Who invented the telephone?",
        "9) Which animal is known as the 'king of the jungle'?",
        "10) What is the tallest mountain in the world?"
    };

    private static final String[][] CHOICES = {
        {"A. Rome", "B. London", "C. Paris"},
        {"A. Leonardo da Vinci", "B. Pablo Picasso", "C. Vincent van Gogh"},
        {"A. Pacific Ocean", "B. Atlantic Ocean", "C. Indian Ocean"},
        {"A. Venus", "B. Mars", "C. Jupiter"},
        {"A. J.K. Rowling", "B. Stephen King", "C. George R.R. Martin"},
        {"A. India", "B. China", "C. Japan"},
        {"A. Au", "B. Ag", "C. Ac"},
        {"A. Alexander Graham Bell", "B. Thomas Edison", "C. Nikola Tesla"},
        {"A. Lion", "B. Elephant", "C. Tiger"},
        {"A. Mount Kilimanjaro", "B. Mount Everest", "C. Mount Fuji"}
    };

    private static final char[] ANSWERS = {'C', 'A', 'A', 'B', 'A', 'A', 'A', 'A', 'A', 'B'};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int score = 0;
        for (int i = 0; i < QUESTIONS.length; i++) {
            System.out.println(QUESTIONS[i]);
            for (int j = 0; j < CHOICES[i].length; j++) {
                System.out.println(CHOICES[i][j]);
            }

            System.out.print("Enter your answer (A, B, or C): ");
            try {
                char answer = Character.toUpperCase(input.nextLine().charAt(0));
                if (!isValidInput(answer)) {
                    throw new InputMismatchException("Invalid input. Only characters A, B, or C are allowed.");
                }

                if (answer == ANSWERS[i]) {
                    score++;
                }

                System.out.println("\n==============================\n");
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Blank input. Please try again.");
                i--;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Only characters A, B, or C are allowed.");
                i--;
            }
        }

        System.out.println("Your score is: " + score);
    }

    private static boolean isValidInput(char ch) {
        return ch == 'A' || ch == 'B' || ch == 'C';
    }
}
