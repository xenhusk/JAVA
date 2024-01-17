import java.util.*;

public class HashTablePT {
    public static void main(String args[]) {
        boolean MenuLoop = true;
        do {
            Scanner input = new Scanner(System.in);
            System.out.printf("MENU\n1: integers\n2: string\n3: exit program\nchoice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("table size: ");
                    int tableSize = input.nextInt();

                    System.out.print("number of inputs: ");
                    int inputs = input.nextInt();

                    IntegerHashTable integerTable = new IntegerHashTable(tableSize);
                    for (int i = 0; i < inputs; i++) {
                        System.out.print("input Key " + (i + 1) + ": ");
                        int key = input.nextInt();
                        System.out.print("input Value " + (i + 1) + ": ");
                        String value = input.next();
                        integerTable.put(key, value);
                    }
                    integerTable.display();
                    break;
                case 2:
                    System.out.print("table size: ");
                    int tableSize2 = input.nextInt();

                    System.out.print("number of inputs: ");
                    int inputs2 = input.nextInt();

                    StringHashTable stringTable = new StringHashTable(tableSize2);
                    for (int i = 0; i < inputs2; i++) {
                        System.out.print("input Key " + (i + 1) + ": ");
                        String key = input.next();
                        System.out.print("input Value " + (i + 1) + ": ");
                        String value = input.next();
                        stringTable.put(key, value);
                    }
                    stringTable.display();
                    break;
                case 3:
                    System.out.println("Exiting Program");
                    MenuLoop = false;
                    break;
            }

            System.out.println();
        } while (MenuLoop);
    }
}

class IntegerHashTable {
    private Hashtable<Integer, String> integerHashTable;

    public IntegerHashTable(int size) {
        integerHashTable = new Hashtable<>(size);
    }

    public void put(int key, String value) {
        integerHashTable.put(key, value);
    }

    public void display() {
        System.out.println("Index\tKey\tValue");
        int index = 0;
        for (Map.Entry<Integer, String> entry : integerHashTable.entrySet()) {
            System.out.println(index++ + "\t" + entry.getKey() + "\t" + entry.getValue());
        }
    }
}

class StringHashTable {
    private Hashtable<String, String> stringHashTable;
    int tablesize;
    public StringHashTable(int size) {
        this.tablesize = size;
        stringHashTable = new Hashtable<>(tablesize);
    }

    public void put(String key, String value) {
        stringHashTable.put(key, value);
    }

    public void display() {
        System.out.println("Hash\tIndex\tKey\tValue");
        int index = 0;
        for (Map.Entry<String, String> entry : stringHashTable.entrySet()) {
            int hash = entry.hashCode();
            int lastFiveDigits = Math.abs(hash % 100000);
            System.out.println(lastFiveDigits + "\t" + index++ + "\t" + entry.getKey() + "\t" + entry.getValue());
        }
        
    }
}
