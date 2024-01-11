import java.util.Scanner;

class HashTable {
    private static final int TABLE_SIZE = 10;
    private int[] table;

    public HashTable() {
        table = new int[TABLE_SIZE];
    }

    // Direct Hashing
    private int directHashing(int key) {
        return key % TABLE_SIZE;
    }

    // Subtraction Hashing
    private int subtractionHashing(int key) {
        return (key - 5) % TABLE_SIZE;
    }

    // Digit Extraction Hashing
    private int digitExtractionHashing(int key) {
        return key % 10; // assuming a single digit key
    }

    // Mod Division Hashing
    private int modDivisionHashing(int key) {
        return key % 7; // assuming a prime number for better distribution
    }

    // Midsquare Hashing
    private int midSquareHashing(int key) {
        int square = key * key;
        String squareString = String.valueOf(square);
        int mid = squareString.length() / 2;
        return Integer.parseInt(squareString.substring(mid - 1, mid + 1));
    }

    // Folding Methods: Fold Shift
    private int foldShift(int key) {
        int sum = 0;
        while (key > 0) {
            sum += key % 100;
            key /= 100;
        }
        return sum % TABLE_SIZE;
    }

    // Folding Methods: Fold Boundary
    private int foldBoundary(int key) {
        int sum = 0;
        while (key > 0) {
            sum += key % 1000;
            key /= 1000;
        }
        return sum % TABLE_SIZE;
    }

    // Linear Probing
    private int linearProbing(int index, int attempt) {
        return (index + attempt) % TABLE_SIZE;
    }

    // Quadratic Probing
    private int quadraticProbing(int index, int attempt) {
        return (index + attempt * attempt) % TABLE_SIZE;
    }

    // Key Offset
    private int keyOffset(int index, int key) {
        int offset = key / TABLE_SIZE;
        return (index + offset) % TABLE_SIZE + 1;
    }

    // Insert method with selected hashing and probing
    public void insert(int key, int hashingMethod, int probingMethod) {
        int index = -1;
        switch (hashingMethod) {
            case 1: index = directHashing(key); break;
            case 2: index = subtractionHashing(key); break;
            case 3: index = digitExtractionHashing(key); break;
            case 4: index = modDivisionHashing(key); break;
            case 5: index = midSquareHashing(key); break;
            case 6: index = foldShift(key); break;
            case 7: index = foldBoundary(key); break;
        }

        int attempt = 0;
        while (table[index] != 0) {
            switch (probingMethod) {
                case 1: index = linearProbing(index, attempt); break;
                case 2: index = quadraticProbing(index, attempt); break;
                case 3: index = keyOffset(index, key); break;
            }
            attempt++;
        }

        table[index] = key;
    }

    // Display the hash table
    public void displayTable() {
        System.out.println("Hash Table:");
        for (int i = 0; i < TABLE_SIZE; i++) {
            System.out.println(i + ": " + table[i]);
        }
    }
}

public class HashingAndProbingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashTable hashTable = new HashTable();

        // Example: Insert keys with Direct Hashing and Linear Probing
        hashTable.insert(25, 1, 1);
        hashTable.insert(12, 1, 1);
        hashTable.insert(32, 1, 1);
        hashTable.insert(42, 1, 1);
        hashTable.insert(7, 1, 1);

        // Display the hash table
        hashTable.displayTable();

        scanner.close();
    }
}
