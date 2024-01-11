import java.util.Scanner;

public class HashingAndProbingPractice {
    public static void main(String[] args) {
        int numOfVarInTable = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Set Table Size: ");
        int tableSize = input.nextInt();
        HashingAndProbingMethods hashingAndProbingMethods = new HashingAndProbingMethods();
        hashingAndProbingMethods.HashTableAndProbingMethods(tableSize);

        System.out.printf("Choose Your Hashing Algorithm\n1: DirectHashing\n2: SubtractionHashing \n3: DigitExtractionHashing\n4: ModDivisionHashing\n5: MidSquareHashing\n6: FMFoldShift\n7: FMFoldBoundary\nOption: ");
        int optionHashing = input.nextInt();

        System.out.printf("Choose Your Probing Algorithm\n1: DirectProbing\n2: QuadraticProbing\n3: KeyOffset\nOption: ");
        int optionProbing = input.nextInt();

        int constant = 0;
        switch (optionHashing) {
            case 2:
                System.out.print("Input Constant: ");
                constant = input.nextInt();
                break;
            case 3:
                System.out.print("Input digit number: ");
                constant = input.nextInt();
                break;
            case 6:
                System.out.print("Input digits per chunk: ");
                constant = input.nextInt();
                break;
            case 7:
                System.out.print("Input boundary after every digit number: ");
                constant = input.nextInt();
                break;
        }

        System.out.print("Input Contents in the Table? Y/N\nOption: ");
        String contentYN = input.next();
        if (contentYN.equalsIgnoreCase("Y")) {
            System.out.printf("How many contents will you put? (Available inputs %d): \nInput: ", (tableSize - numOfVarInTable));
            int numOfInputs = input.nextInt();
            if (numOfVarInTable < tableSize) {
                int addToTable = 0;
                for (int i = 0; i < Math.min(numOfInputs - numOfVarInTable, tableSize - numOfVarInTable); i++) {
                    System.out.print("Input integer " + (i + 1) + ": ");
                    if (input.hasNextInt()) {
                        int key = input.nextInt();
                        hashingAndProbingMethods.insert(key, optionHashing, optionProbing, constant);
                        addToTable++;
                    } else {
                        System.out.println("Invalid input. Please enter an integer.");
                        input.next(); // Consume the invalid input
                        i--; // Decrement i to re-enter the current iteration
                    }
                }
                numOfVarInTable = numOfVarInTable + addToTable;
            } else {
                System.out.println("Table is full; cannot add more elements");
            }
        }

        boolean mainLoop = true;
        do {
            System.out.printf("Choose an Option\n1: Display Table\n2: Clear Table\n3: Delete an Index\n4: Add Element/s\n5: Exit\nOption: ");
            int optionMain = input.nextInt();
            switch (optionMain) {
                case 1:
                    if (numOfVarInTable > 0) {
                        hashingAndProbingMethods.displayTable();
                    } else {
                        System.out.println("Table is empty. No elements to display.");
                    }
                    break;
                case 2:
                    hashingAndProbingMethods.clearTable();
                    numOfVarInTable = 0;
                    break;
                case 3:
                    System.out.print("Input index to remove: ");
                    int remIndex = input.nextInt();
                    hashingAndProbingMethods.removeAtIndex(remIndex);
                    numOfVarInTable--;
                    break;
                case 4:
                    System.out.printf("How many contents will you put? (Available inputs %d): \nInput: ", (tableSize - numOfVarInTable));
                    int numOfInputs = input.nextInt();
                    if (numOfVarInTable < tableSize) {
                        int addToTable = 0;
                        for (int i = 0; i < Math.min(numOfInputs - numOfVarInTable, tableSize - numOfVarInTable); i++) {
                            System.out.print("Input integer " + (i + 1) + ": ");
                            if (input.hasNextInt()) {
                                int key = input.nextInt();
                                hashingAndProbingMethods.insert(key, optionHashing, optionProbing, constant);
                                addToTable++;
                            } else {
                                System.out.println("Invalid input. Please enter an integer.");
                                input.next(); // Consume the invalid input
                                i--; // Decrement i to re-enter the current iteration
                            }
                        }
                        numOfVarInTable = numOfVarInTable + addToTable;
                    } else {
                        System.out.println("Table is full; cannot add more elements");
                    }
                    break;
                case 5:
                    System.out.println("Exiting Program");
                    mainLoop = false;
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
                    break;
            }
        } while (mainLoop);

        input.close();
    }
}
